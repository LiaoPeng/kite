package com.galaxy.kite.tutorial.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.nio.channels.Pipe.SinkChannel;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;


public class PipeCommunication {
	
	public static void main(String[] args) throws IOException {
		
		Pipe pipe = Pipe.open();
		SinkChannel sinkChannel = pipe.sink();
		
		ByteBuffer byteBuffer = ByteBuffer.allocate(80);
		byteBuffer.clear();
		
		String message = "You are come from thread a.";
		System.out.println(Arrays.toString(message.getBytes()));
		byteBuffer.put(message.getBytes());
		byteBuffer.flip();
		sinkChannel.write(byteBuffer);
		
		SourceChannel sourceChannel = pipe.source();
		byteBuffer.clear();
		System.out.println(byteBuffer.toString());
		sourceChannel.read(byteBuffer);
		System.out.println(byteBuffer.toString());
		byteBuffer.flip();
		System.out.println(byteBuffer.toString());
		
		
		byte[] byteArr = byteBuffer.array();
		System.out.println(Arrays.toString(byteArr));
		
		byte aByte = 0;
		while(byteBuffer.hasRemaining()){
			aByte = byteBuffer.get();
			System.out.print(aByte);
		}
		
		byteBuffer.rewind();
		while(byteBuffer.hasRemaining()){
			aByte = byteBuffer.get();
			System.out.print((char)aByte);
		}
	}

}
