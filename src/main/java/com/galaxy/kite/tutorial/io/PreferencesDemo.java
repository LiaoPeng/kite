package com.galaxy.kite.tutorial.io;

import java.util.prefs.Preferences;

public class PreferencesDemo {
	
	public static void main(String[] args) {
		
		Preferences prefs = Preferences.userNodeForPackage(PreferencesDemo.class);
		prefs.put("Location", "CN");
		prefs.put("FootWear", "soccor");
		prefs.putInt("age", 28);
	}

}
