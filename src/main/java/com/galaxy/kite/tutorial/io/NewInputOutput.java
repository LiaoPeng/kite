package com.galaxy.kite.tutorial.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NewInputOutput {

	public static void byteBufferReading(File file) throws IOException {

		int bufferCapacity = 1024;
		ByteBuffer byteBuffer = ByteBuffer.allocate(bufferCapacity);
		FileChannel finChannel = new FileInputStream(file).getChannel();

		while (finChannel.read(byteBuffer) != -1) {

			while (byteBuffer.hasRemaining()) {
				char c = (char) byteBuffer.get();
				System.out.print(c);
			}
			byteBuffer.rewind();
		}

		finChannel.close();
	}
}
