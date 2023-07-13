class Metro{
    static int index;
    //String stationName={"rajajinagar","magadi road","mejastic","m g road","peenya","dasarahalli","nagasandra","hosahalli"};
    static String stationName[] ={null,null,null,null,null,null,null,null};

    public static void getMetroStation(){
        for(int station=0 ;station<stationName.length;station++){
            String name = stationName[station];
            System.out.println(name);
        }
    }
    public static boolean addMetro(String metro){
        boolean isAdded=false;
        if(metro !=null){
            stationName[index++] = metro;
            isAdded=true;
        }
        else {
            System.out.println("cannot add station,it is null");
        }
		return isAdded;
    }
	
	public static boolean updateStation(String existingStation , String updatedStation){
	   
	   boolean isUpdated=false;
	   for(int stationIndex=0;stationIndex<stationName.length;stationIndex++){
		   
		   if(stationName[stationIndex].equals(existingStation)){
		   
		   stationName[stationIndex] = updatedStation ;
		   isUpdated = true;
		   }
	   }return isUpdated;
}	
}