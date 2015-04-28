package com.galaxy.kite.tutorial.io;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StringList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6474063270638715120L;
	private int size = 0;
	private Entry head = null;

	private static class Entry implements Serializable {
		String data;
		Entry next;
		Entry previous;
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.defaultWriteObject();
		out.write(size);
		
		for(Entry e = head; e != null ; e = e.next){
			out.writeObject(head);
		}
	}

}
