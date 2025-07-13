package com.sp.eagerinstantiation.pattern;

public class VoiceRecognizer
{
	// create the object and assign to static variable, so that it
	// would be initialized only once and only one object will be created
	private static VoiceRecognizer instance = new VoiceRecognizer();

	private VoiceRecognizer()
	{

	}

	public void recognize()
	{
		System.out.println("recognizer agent : " + this.hashCode() + " is present");
	}
	//alt+shift+s+r,alt+g
	public static VoiceRecognizer getInstance()
	{
		return instance;
	}
}
