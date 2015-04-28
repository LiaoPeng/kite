package com.galaxy.kite.tutorial.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;


public class ChannelAccept {
	
	public static final String GREETING = "Hello I must be going.\r\n";
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		int port = 1234;
		
		ByteBuffer buffer = ByteBuffer.wrap(GREETING.getBytes());
		ServerSocketChannel ssc = ServerSocketChannel.open();
		ssc.socket().bind(new InetSocketAddress(port));
		ssc.configureBlocking(false);
		
		while (true) {
			System.out.println("Waiting for connection:");
			SocketChannel sc = ssc.accept();
			if(sc == null){
				Thread.sleep(2000);
			} else {
				System.out.println("Incoming connection from:" + sc.socket().getRemoteSocketAddress());
				buffer.rewind();
				sc.write(buffer);
				sc.close();
			}
		}
		
	}
}
