package com.sp.test;

import com.sp.synclazyinstantiation.pattern.VoiceRecognizer;
import com.sp.synclazyinstantiation.runnable.CallerThread;
import com.sp.synclazyinstantiation.runnable.MessengerThread;

public class MultiThreadedSingletonPatternTest
{
	public static void main(String[] args)
	{
		CallerThread callerThread = new CallerThread();
		MessengerThread messengerThread = new MessengerThread();
		
		for(int i = 0; i < 100; i++)
		{
			Thread t1 = new Thread(callerThread);
			Thread t2 = new Thread(messengerThread);
			t1.start();
			t2.start();
		}
	
	}
}
