class TelevisionTester{

public static void main(String args[]){
	
	boolean connected=Television.onOrOff();
	System.out.println("Is Television On " + connected);
	boolean value=Television.onOrOff();
	System.out.println("Is Television On " + value);
	
	Television.increaseVolume();
	//System.out.println("Volume increased " + Volume1);
	Television.increaseVolume();
	Television.increaseVolume();
	boolean connected1=Television.onOrOff();
	System.out.println("Is Television on  " + connected1);
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
}
}