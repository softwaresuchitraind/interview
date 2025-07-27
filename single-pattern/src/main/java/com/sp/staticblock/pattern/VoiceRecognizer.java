package com.sp.staticblock.pattern;

public class VoiceRecognizer
{
	//let us store the object we have created in static variable so that we have only one copy of the object
	private static VoiceRecognizer instance;//if we dont have any initialization logic to be performed directly instantiate and assign.
	
	private  static String sensitivityLevel;
	//Normal, Less Sensitive, High Senitive
	
	static
	{
		sensitivityLevel ="Normal";
		instance = new VoiceRecognizer();
	}
	
	
	private VoiceRecognizer()
	{
		
	}
	
	public static VoiceRecognizer getInstance()
	{
		return instance;
	}
	
	public void recognize()
	{
		System.out.println("recognizer agent : " + this.hashCode() + " is present");
	}
}
