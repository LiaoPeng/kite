package com.galaxy.kite.tutorial.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class SerializationPeriod implements Serializable{
	
	private static final long serialVersionUID = -2485935778404123471L;
	public Date startDate;
	public Date endDate;
	
	SerializationPeriod(Date startDate,Date endDate){
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public static class PeriodProxy implements Serializable{
		
		private static final long serialVersionUID = -9156565346011020126L;
		private Date startDate;
		private Date endDate;
		
		PeriodProxy(SerializationPeriod period){
			startDate = period.startDate;
			endDate = period.endDate;			
		}
		
		private Object readResolve(){
			return  new SerializationPeriod(startDate,endDate);
		}
	}
	
	private Object writeReplace(){
		return new PeriodProxy(this);
	}
	
	private Object readObject() throws InvalidObjectException{
		throw new InvalidObjectException("Proxy required");
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Date startDate = new Date();
		Date endDate = new Date();
		
		SerializationPeriod period = new SerializationPeriod(startDate,endDate);
		
		ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
		ObjectOutputStream outputStream = new ObjectOutputStream(byteStream);
		outputStream.writeObject(period);
		
		ObjectInputStream inputStream = new ObjectInputStream(new ByteArrayInputStream(byteStream.toByteArray()));
		Object object = inputStream.readObject();
		
		System.out.println(object);
	}
}
