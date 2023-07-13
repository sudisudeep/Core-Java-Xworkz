class WashingMachineTester{

public static void main(String args[]){
	
	boolean connected=WashingMachine.onOrOff();
	System.out.println("Is WashingMachine On " + connected);
	boolean value=WashingMachine.onOrOff();
	System.out.println("Is WashingMachine On " + value);
	
	WashingMachine.increaseTime();
	//System.out.println("Time increased " + Time1);
	WashingMachine.increaseTime();
	WashingMachine.increaseTime();
	boolean connected1=WashingMachine.onOrOff();
	System.out.println("Is WashingMachine on  " + connected1);
	WashingMachine.decreaseTime();
	WashingMachine.decreaseTime();
	WashingMachine.decreaseTime();
	WashingMachine.decreaseTime();
	WashingMachine.decreaseTime();
	WashingMachine.decreaseTime();
	WashingMachine.decreaseTime();
	WashingMachine.decreaseTime();
	WashingMachine.decreaseTime();
}
}