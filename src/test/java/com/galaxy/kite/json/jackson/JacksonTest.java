package com.galaxy.kite.json.jackson;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import com.galaxy.kite.model.user.Person;

public class JacksonTest {

	

	@Test
	public void testConverObjectToJson() throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(new SimpleDateFormat("MM/dd/yyyy"));
		Person kite = new Person();
		kite.setAddress("China");
		kite.setName("Kite");
		kite.setAge(12);
		kite.setBirthday( new Date(1988-1900,10,22));
		kite.setLuckDay(new Date(2014-1900,10,22));
		
		Writer strWriter = new StringWriter();
		mapper.writeValue(strWriter, kite);
		
		String userDataJSON = strWriter.toString();
		
		System.out.println(String.format("Convert person to json %s", userDataJSON) );
		
	}
	

}
