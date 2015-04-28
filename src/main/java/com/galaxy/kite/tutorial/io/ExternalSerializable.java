package com.galaxy.kite.tutorial.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.galaxy.kite.util.objects.ObjectFormat;

public class ExternalSerializable implements Externalizable {
	
	private int age;
	private String name;
	
	protected ExternalSerializable() {
	}
	
	protected ExternalSerializable(int age,String name){
		this.age = age;
		this.name = name;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {

	}

	@Override
	public String toString(){
		return ObjectFormat.toJsonString(this);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
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
