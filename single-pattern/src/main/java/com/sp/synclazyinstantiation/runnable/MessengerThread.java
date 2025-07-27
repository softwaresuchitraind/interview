package com.sp.synclazyinstantiation.runnable;

import com.sp.doublecheck.pattern.VoiceRecognizer;

public class MessengerThread implements Runnable
{
	@Override
	public void run()
	{
		VoiceRecognizer voiceRecognizer= VoiceRecognizer.getInstance();
		voiceRecognizer.recocgnize();
		
	}
}
