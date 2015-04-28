package com.galaxy.kite.tutorial.io;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class TypicalUseOfStream {

	
	public static String bufferedInputFile(File file) throws IOException{
		
		BufferedReader in = new BufferedReader( new FileReader(file));
		StringBuilder stringBuilder = new StringBuilder();
		String string;
		while( (string = in.readLine())!= null ){
			stringBuilder.append(string);
		}
		System.out.println(stringBuilder.toString());
		in.close();
		return stringBuilder.toString();
	}

	
	public static void testByteEof(File file) throws IOException{
		
		ByteArrayInputStream inputStream = new ByteArrayInputStream(bufferedInputFile(file).getBytes());
		int readValue = -1;
		while( (readValue = inputStream.read()) != -1){
			System.out.print( (char)readValue);
		}
		inputStream.close();
	}
	
	
	public static String usingRandomAccessFile(File file) throws IOException{
		
		RandomAccessFile rf = new RandomAccessFile(file,"rw");
		double pi = 3.1415926d;
		
		for(int i=0; i< 12; i++){
			rf.writeDouble(pi * i);
		}
		
		rf.seek(8);
		
		for(int i=0; i< 3; i++){
			double readValue =  rf.readDouble();
			System.out.print(readValue);
		}
		System.out.println();
		rf.close();
		return null;
	}
	
	public static void saveObjectSerializableFile(File file,Object target) throws IOException{
		
		ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream(file));
		out.writeObject(target);
		out.close();
	}
	
	public static Object[] readObjectSerializableFile(File file) throws IOException, IOException, ClassNotFoundException{
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
		Object object = in.readObject();
		return new Object[]{object};
	}
}



