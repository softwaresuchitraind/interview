package com.sp.beans;

import com.sp.lazyinstantiation.pattern.VoiceRecognizer;

public class Messenger
{
	public void readMessage()
	{
		//VoiceRecognizer voiceRecognizer = new VoiceRecognizer();
		//voiceRecognizer.recognize();
		VoiceRecognizer voiceRecognizer = VoiceRecognizer.getInstance();
		voiceRecognizer.recognize();
	}
}
