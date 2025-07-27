package com.sp.beans;

import com.sp.lazyinstantiation.pattern.*;

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
