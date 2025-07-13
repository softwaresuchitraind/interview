package com.sp.beans;

import com.sp.eagerinstantiation.pattern.VoiceRecognizer;

public class Caller
{
	public void listen()
	{
		//VoiceRecognizer voiceRecognizer = new VoiceRecognizer();
		//voiceRecognizer.recognize();
		VoiceRecognizer voiceRecognizer = VoiceRecognizer.getInstance();
		voiceRecognizer.recognize();
	}
}
