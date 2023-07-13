class MicrowaveTester{

public static void main(String args[]){
	
	boolean connected=Microwave.onOrOff();
	System.out.println("Is Microwave On " + connected);
	boolean value=Microwave.onOrOff();
	System.out.println("Is Microwave On " + value);
	
	Microwave.increaseTemparature();
	//System.out.println("Temparature increased " + Temparature1);
	Microwave.increaseTemparature();
	Microwave.increaseTemparature();
	boolean connected1=Microwave.onOrOff();
	System.out.println("Is Microwave on  " + connected1);
	Microwave.decreaseTemparature();
	Microwave.decreaseTemparature();
	Microwave.decreaseTemparature();
	Microwave.decreaseTemparature();
	Microwave.decreaseTemparature();
	Microwave.decreaseTemparature();
	Microwave.decreaseTemparature();
	Microwave.decreaseTemparature();
}
}