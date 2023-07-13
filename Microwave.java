class Microwave{


	static String name="Bajaj";
	static int minTemperature;
	static int currentTemperature=5;
	static int maxTemperature =10;
	static boolean isConnected;
	
	public static boolean onOrOff(){
	
		System.out.println("Invoking onorOff()");
		System.out.println("parameter =" + 0);
			if(isConnected==false){
				isConnected=true;
				System.out.println("Microwave turned on ..");
			}else if(isConnected==true){
				isConnected=false;
				System.out.println("Microwave turned off..");
			}
			
			return isConnected;
	}
	
	public static void increaseTemperature (){
	
		
		if (isConnected==true){
			
			if(currentTemperature <maxTemperature ){
				currentTemperature =currentTemperature +1;
				System.out.println("the current Temperature  is"+ currentTemperature );
			
			
			}else{
			
				System.out.println("max Temperature of Microwave");
		}
		
		}else{
			
			System.out.println("Microwave is off");
		
		
		}
	}
	public static void decreaseTemperature (){
		if(isConnected==true){
			
			if(currentTemperature >minTemperature ){
				currentTemperature =currentTemperature -1;
				System.out.println("the current Temperature  is " + currentTemperature );
			}else{
				System.out.println("min Temperature of Microwave");
			}
		}else {
			System.out.println("Microwave is off");
		}
	}

}