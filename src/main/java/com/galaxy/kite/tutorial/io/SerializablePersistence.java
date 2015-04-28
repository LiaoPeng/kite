package com.galaxy.kite.tutorial.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class House implements Serializable{
	int age = 12;
}

class Animal implements Serializable{
	House house;
	public Animal(House house) {
		this.house = house;
	}
}

public class SerializablePersistence {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		House house = new House();
		Animal animal1 = new Animal(house);
		Animal animal2 = new Animal(house);
		Animal animal3 = new Animal(house);
		
		ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
		ObjectOutputStream outputStream = new ObjectOutputStream(byteArray);
		outputStream.writeObject(animal1);
		outputStream.writeObject(animal2);
		
		ByteArrayOutputStream byteArray1 = new ByteArrayOutputStream();
		ObjectOutputStream outputStream1 = new ObjectOutputStream(byteArray1);
		outputStream1.writeObject(animal3);
		
		ObjectInputStream inputStream = new ObjectInputStream(new ByteArrayInputStream(byteArray.toByteArray()));
		Animal serialAnimal1 = (Animal) inputStream.readObject();
		Animal serialAnimal2 = (Animal) inputStream.readObject();

		ObjectInputStream inputStream1 = new ObjectInputStream(new ByteArrayInputStream(byteArray1.toByteArray()));
		Animal serialAnimal3 = (Animal) inputStream1.readObject();
	
		System.out.println(serialAnimal1.house);
		System.out.println(serialAnimal2.house);
		System.out.println(serialAnimal3.house);
	}
}
