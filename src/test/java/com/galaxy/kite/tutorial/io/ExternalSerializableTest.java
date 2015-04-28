package com.galaxy.kite.tutorial.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class ExternalSerializableTest {
	
	@Test
	public void testExternalSerializable() throws IOException, ClassNotFoundException{
		
		ExternalSerializable serialObject = new ExternalSerializable(28, "Pumbaa");
		ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
		System.out.println(serialObject);
		ObjectOutputStream outStream = new ObjectOutputStream(byteArray);
		outStream.writeObject(serialObject);
		byteArray.close();
		
		ObjectInputStream inputStream = new ObjectInputStream(new ByteArrayInputStream(byteArray.toByteArray()) );
		ExternalSerializable object = (ExternalSerializable) inputStream.readObject();
		System.out.println(object);
	}

}
