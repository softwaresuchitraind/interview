package dp;

class VoiceRecongnizer
{
	private static VoiceRecongnizer instance = new VoiceRecongnizer();

	private VoiceRecongnizer()
	{

	}

	public static VoiceRecongnizer getInstance()
	{
		return instance;
	}
}

class Messenger
{
	void readMessage()
	{
		VoiceRecongnizer voiceRecongnizer = VoiceRecongnizer.getInstance();
		System.out.println(voiceRecongnizer.hashCode());
	}
}

class Caller
{
	void listen()
	{
		VoiceRecongnizer voiceRecongnizer = VoiceRecongnizer.getInstance();
		System.out.println(voiceRecongnizer.hashCode());
	}
}

public class Test
{
	public static void main(String[] args)
	{
		Messenger messenger = new Messenger();
		messenger.readMessage();

		Caller caller = new Caller();
		caller.listen();

	}
}
