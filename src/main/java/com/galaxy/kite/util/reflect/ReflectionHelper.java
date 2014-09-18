package com.galaxy.kite.util.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionHelper {

	public static final String MODIFIERS_FIELD = "modifiers";

	/**
	 * @param field
	 * @param value
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	public static void setStaticFinalField(Field field, Object value) throws NoSuchFieldException, IllegalAccessException {
		// Modify the access, mark the filed to be public
		field.setAccessible(true);
		// next we change the modifier in the Field instance to not be final anymore, 
		// thus tricking reflection into letting us modify the static final field
		Field modifiersField = Field.class.getDeclaredField(MODIFIERS_FIELD);
		modifiersField.setAccessible(true);
		int modifiers = modifiersField.getInt(field);
		// Wipe the final bit in the modifiers int
		modifiers &= ~Modifier.FINAL;
		modifiersField.setInt(field, modifiers);
		field.set(null, value);
	}
	
	public static void setStaticFinalField(Class calss, String fieldName, Object value) throws NoSuchFieldException, SecurityException, IllegalAccessException{
		
		Field field = calss.getDeclaredField(fieldName);
		setStaticFinalField(field,value);
	}

}
