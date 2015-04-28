package com.galaxy.kite.tutorial.io;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;

public class ReaderWriter {

	public void newStringWriter() throws IOException{
		
		StringWriter stringWriter = new StringWriter();
		CharArrayWriter charArrayWriter = new CharArrayWriter();
		PipedWriter pipedWriter = new PipedWriter();
		FileWriter fileWriter = new FileWriter(new File(".file.txt"));
		fileWriter.write("String");
		
	}
	
	
	public void byteBuffer(){
		
		ByteBuffer.allocate(Integer.valueOf(0));
	}
	
}
