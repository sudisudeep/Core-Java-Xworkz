class Television{


	static String name="Onida";
	static int minVolume;
	static int currentVolume=7;
	static int maxVolume =15;
	static boolean isConnected;
	
	public static boolean onOrOff(){
	
		System.out.println("Invoking onorOff()");
		System.out.println("parameter =" + 0);
			if(isConnected==false){
				isConnected=true;
				System.out.println("Television turned on ..");
			}else if(isConnected==true){
				isConnected=false;
				System.out.println("Television turned off..");
			}
			
			return isConnected;
	}
	
	public static void increaseVolume (){
	
		
		if (isConnected==true){
			
			if(currentVolume <maxVolume ){
				currentVolume =currentVolume +1;
				System.out.println("the current Volume  is"+ currentVolume );
			
			
			}else{
			
				System.out.println("max Volume of Television");
		}
		
		}else{
			
			System.out.println("Television is off");
		
		
		}
	}
	public static void decreaseVolume (){
		if(isConnected==true){
			
			if(currentVolume >minVolume ){
				currentVolume =currentVolume -1;
				System.out.println("the current Volume  is " + currentVolume );
			}else{
				System.out.println("min Volume of Television");
			}
		}else {
			System.out.println("Television is off");
		}
	}

}