class Mixer{


	static String name="Preethi";
	static int minSpeed;
	static int currentSpeed=2;
	static int maxSpeed =5;
	static boolean isConnected;
	
	public static boolean onOrOff(){
	
		System.out.println("Invoking onorOff()");
		System.out.println("parameter =" + 0);
			if(isConnected==false){
				isConnected=true;
				System.out.println("Mixer turned on ..");
			}else if(isConnected==true){
				isConnected=false;
				System.out.println("Mixer turned off..");
			}
			
			return isConnected;
	}
	
	public static void increaseSpeed (){
	
		
		if (isConnected==true){
			
			if(currentSpeed <maxSpeed ){
				currentSpeed =currentSpeed +1;
				System.out.println("the current Speed  is"+ currentSpeed );
			
			
			}else{
			
				System.out.println("max Speed of Mixer");
		}
		
		}else{
			
			System.out.println("Mixer is off");
		
		
		}
	}
	public static void decreaseSpeed (){
		if(isConnected==true){
			
			if(currentSpeed >minSpeed ){
				currentSpeed =currentSpeed -1;
				System.out.println("the current Speed  is " + currentSpeed );
			}else{
				System.out.println("min Speed of Mixer");
			}
		}else {
			System.out.println("Mixer is off");
		}
	}

}