class MixerTester{

public static void main(String args[]){
	
	boolean connected=Mixer.onOrOff();
	System.out.println("Is Mixer On " + connected);
	boolean value=Mixer.onOrOff();
	System.out.println("Is Mixer On " + value);
	
	Mixer.increaseSpeed();
	//System.out.println("Speed increased " + Speed1);
	Mixer.increaseSpeed();
	Mixer.increaseSpeed();
	Mixer.increaseSpeed();
	Mixer.increaseSpeed();
	boolean connected1=Mixer.onOrOff();
	System.out.println("Is Mixer on  " + connected1);
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();

	
	
}
}