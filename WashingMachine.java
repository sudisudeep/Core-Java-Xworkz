class WashingMachine{


	static String name="Whirlpool";
	static int minTime;
	static int currentTime=30;
	static int maxTime =60;
	static boolean isConnected;
	
	public static boolean onOrOff(){
	
		System.out.println("Invoking onorOff()");
		System.out.println("parameter =" + 0);
			if(isConnected==false){
				isConnected=true;
				System.out.println("WashingMachine turned on ..");
			}else if(isConnected==true){
				isConnected=false;
				System.out.println("WashingMachine turned off..");
			}
			
			return isConnected;
	}
	
	public static void increaseTime (){
	
		
		if (isConnected==true){
			
			if(currentTime <maxTime ){
				currentTime =currentTime +5;
				System.out.println("the current Time  is"+ currentTime + "Minutes" );
			
			
			}else{
			
				System.out.println("max Time of WashingMachine");
		}
		
		}else{
			
			System.out.println("WashingMachine is off");
		
		
		}
	}
	public static void decreaseTime (){
		if(isConnected==true){
			
			if(currentTime >minTime ){
				currentTime =currentTime -5;
				System.out.println("the current Time  is " + currentTime + "Minutes" );
			}else{
				System.out.println("min Time of WashingMachine");
			}
		}else {
			System.out.println("WashingMachine is off");
		}
	}

}