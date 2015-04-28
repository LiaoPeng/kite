package com.galaxy.kite.tutorial.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NewInputOutputTest {
	
	private File file = null; 
	private String fileName = "file.txt";
	
	@Before
	public void setUp() throws IOException{
		
		file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter out = new FileWriter(file);
		out.write("TypicalUseOfStreamTest");
		out.close();
		
	}
	
	@Test
	public void testByteBufferReading() throws IOException{
		
		NewInputOutput.byteBufferReading(file);
		
	}
	
	
	
	@After
	public void finalize(){
		
		if(file.exists()){
			boolean isDelete =file.delete();
			System.out.println("Delete result:" + isDelete);
		}
		
	}

}
