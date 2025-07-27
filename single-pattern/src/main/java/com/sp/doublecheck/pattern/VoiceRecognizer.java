package com.sp.doublecheck.pattern;

public class VoiceRecognizer
{
	private static VoiceRecognizer instance;
	private VoiceRecognizer()
	{
		
	}
	public static VoiceRecognizer getInstance()
	{
		if(instance==null)
		{
			System.out.println("lock");
			synchronized (VoiceRecognizer.class)
			{
				if(instance == null)
				{
					instance = new VoiceRecognizer();
				}
			}
			System.out.println("relesed lock");
		}
		return instance;
	}
	
	public void recocgnize()
	{
		System.out.println("double check voice recognizer: "+this.hashCode()+ " is recognizing...");
	}
}
