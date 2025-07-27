package com.sp.lazyinstantiation.pattern;

public class VoiceRecognizer
{
	private static VoiceRecognizer instance;
	
	static
	{
		System.out.println("loading classes............");
	}
	private VoiceRecognizer()
	{
		
	}
	public static VoiceRecognizer getInstance()
	{
		System.out.println("getinstance is called");
		if(instance == null)//create only when it has not created
		{
			System.out.println("creating object");
			instance =new VoiceRecognizer();
		}
		return instance;
	}
	public void recognize()
	{
		System.out.println("recognizer agent : " + this.hashCode() + " is present lazily");
	}

}
