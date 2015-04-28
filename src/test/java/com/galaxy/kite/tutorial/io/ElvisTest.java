package com.galaxy.kite.tutorial.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Ignore;
import org.junit.Test;

public class ElvisTest {
	
	@Test
	public void testInstanceControl() throws IOException, ClassNotFoundException{
		
		System.out.println(Elvis.INSTANCE);
	
		ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream outputStream = new ObjectOutputStream(byteOutputStream);
		outputStream.writeObject(Elvis.INSTANCE);
		
		ByteArrayInputStream byteInputStream = new ByteArrayInputStream(byteOutputStream.toByteArray());
		byteOutputStream.close();
		ObjectInputStream objectInputStream = new ObjectInputStream(byteInputStream);
		Elvis elvis = (Elvis) objectInputStream.readObject();
		System.out.println(elvis);
		objectInputStream.close();
		
	}
	
	@Test
	@Ignore
	public void testElvisStealer() throws IOException, ClassNotFoundException{
		
		System.out.println(Elvis.INSTANCE);
		
		
		ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream outputStream = new ObjectOutputStream(byteOutputStream);
		outputStream.writeObject( new ElvisStealer());
		
		ByteArrayInputStream byteInputStream1 = new ByteArrayInputStream(byteOutputStream.toByteArray());

		ByteArrayInputStream byteInputStream2 = new ByteArrayInputStream(byteOutputStream.toByteArray());
		byteOutputStream.close();
		ObjectInputStream objectInputStream1 = new ObjectInputStream(byteInputStream1);
		Object obj1 = objectInputStream1.readObject();
		System.out.println(obj1);
		
		ObjectInputStream objectInputStream2 = new ObjectInputStream(byteInputStream2);
		Object obj2 = objectInputStream2.readObject();
		System.out.println(obj2);
		System.out.println(ElvisStealer.impersonator);
		
	}

}
