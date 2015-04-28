package com.galaxy.kite.tutorial.nio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileHole {
	
	public static void main(String[] args) throws IOException {
		
		File temp = File.createTempFile("hole", null);
		System.out.println("Temp file absolute path:" + temp.getAbsolutePath());
		
		RandomAccessFile file = new RandomAccessFile(temp, "rw");
		FileChannel channel = file.getChannel();
		
		ByteBuffer byteBuffer = ByteBuffer.allocate(100);
		putData(0, byteBuffer, channel);
		putData(500000, byteBuffer, channel);
		putData(50000, byteBuffer, channel);
		
		System.out.println(String.format("Temp file length: %s", file.length()));
		channel.close();
		file.close();
	}
	
	private static void putData(int position, ByteBuffer byteBuffer, FileChannel channel) throws IOException{
		
		String string = "*--- location" + position;
		byteBuffer.clear();
		System.out.println(String.format("Put data byte length:%s", string.getBytes("US-ASCII").length));
		byteBuffer.put(string.getBytes("US-ASCII"));
		byteBuffer.flip();
		channel.position(position);
		channel.write(byteBuffer);
	}

}