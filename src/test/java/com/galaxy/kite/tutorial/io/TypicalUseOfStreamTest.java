package com.galaxy.kite.tutorial.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Categories.IncludeCategory;

import com.galaxy.kite.model.user.Person;
import com.google.inject.internal.asm.Type;

public class TypicalUseOfStreamTest {

	private File file = null;
	private String fileName = "file.txt";

	@Before
	public void setUp() throws IOException {

		file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		/*
		 * FileWriter out = new FileWriter(file);
		 * out.write("TypicalUseOfStreamTest"); out.close();
		 */

	}

	@Test
	@Ignore
	public void testBufferRead() throws IOException {
		TypicalUseOfStream.bufferedInputFile(file);
	}

	@Test
	@Ignore
	public void testByteEof() throws IOException {
		TypicalUseOfStream.testByteEof(file);
	}

	@Test
	@Ignore
	public void testRandomAccessFile() throws IOException {
		// TypicalUseOfStream.usingRandomAccessFile(file);
		System.out.append((char) 12);
		System.out.format("Lin is:%s;born birthday:%s", "girl", 86);

	}

	@Test
	public void testObjectSerializable() throws IOException,
			ClassNotFoundException {

		Person person = Person.newPersionInstance();
		TypicalUseOfStream.saveObjectSerializableFile(file, person);

		Object[] target = TypicalUseOfStream.readObjectSerializableFile(file);
		for (Object object : target) {
			System.out.println(object);
		}
	}

	@After
	public void finalize() {

		if (file.exists()) {
			boolean isDelete = file.delete();
			System.out.println("Delete result:" + isDelete);
		}

	}

}
