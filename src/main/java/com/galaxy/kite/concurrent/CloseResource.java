package com.galaxy.kite.concurrent;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class IOBlocked implements Runnable{
	
	private InputStream inputStream;
	
	public IOBlocked(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	@Override
	public void run() {
		try{
			System.out.println("Waiting for read():");
			inputStream.read();
		}catch(IOException ioException){
			if(Thread.currentThread().isInterrupted()){
				System.out.println("Interrupted from blocked I/O");
			} else {
				throw new RuntimeException(ioException);
			}	
		}
		System.out.println("Exiting IOBlocked run()");
	}
}


class NIOBlocked implements Runnable{
	
	private final SocketChannel sc;
	
	NIOBlocked(SocketChannel sc){
		this.sc = sc;
	}

	@Override
	public void run() {
		try{
			System.out.println("Waiting for read() in " + this);
			sc.read(ByteBuffer.allocate(1));
		} catch(ClosedByInterruptException closeByInterruptException){
			System.out.println("Closing by interrupt exception");
		} catch(AsynchronousCloseException e){
			System.out.println("AsynchronousCloseException");
		} catch(IOException ioException){
			throw new RuntimeException(ioException);
		}
		System.out.println("Exiting NiOBlocked.run " + this);
	}
}

public class CloseResource {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		ExecutorService executorService = Executors.newCachedThreadPool();
		ServerSocket socket = new ServerSocket(8080);
		
		InputStream socketInput = new Socket("localhost",8080).getInputStream();
		
		executorService.execute(new IOBlocked(socketInput));
		executorService.execute(new IOBlocked(System.in));
		
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.println("Shutting down all threads");
		executorService.shutdownNow();
		TimeUnit.MILLISECONDS.sleep(1000);

		System.out.println("Closing " + socketInput.getClass().getName());
		socketInput.close();
		TimeUnit.MILLISECONDS.sleep(1000);
		System.in.close();
		System.out.println("Closing " + System.in.getClass().getName());
		
	}

}
