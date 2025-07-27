package com.sp.clone.pattern;

public class VoiceRecognizer extends Audit implements Cloneable
{
	public static VoiceRecognizer instance;
	private VoiceRecognizer()
	{
		
	}
	public static VoiceRecognizer getInstance() {
		if(instance == null)
		{
			synchronized(VoiceRecognizer.class)
			{
				if(instance==null)
				{
					instance = new VoiceRecognizer();
				}
			}
		}
		return instance;
	}
	public void recognize() throws CloneNotSupportedException
	{
		System.out.println("voice recognizer : "+this.hashCode() + "is recognizing");
		VoiceRecognizer voiceRecognizer = (VoiceRecognizer)this.clone();
		System.out.println("hey i have another copy" +this.hashCode());
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		
		throw new CloneNotSupportedException();
	}
}
