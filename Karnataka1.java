class Karnataka1 {

    static int index;
    //String cityName={"chikmanglore","banglore","shimoga","Davanagere","bidar","kolar","hassan","mandya"};
	
    static String cityName[] = {null,null,null,null,null,null,null,null};

   public static void getDistricName(){

    for(int distric =0;distric<cityName.length;distric++){
        
		String name = cityName[distric];
        System.out.println(name);
    }
   }

   public static boolean createCity(String city){
    boolean iscreated = false;
	
		if(index<cityName.length){

		if(city != null){
			cityName[index++] = city;
			iscreated = true;
			//System.out.println("city added");
			
		}
		else{
			System.out.println("cannot add city ,it is null");
    }
	}
	else {
		System.out.println("out of index");
	}
	return iscreated;
   }
   
   public static boolean updateCity(String existingCity , String updatedCity){
	   
	   boolean isUpdated=false;
	   for(int cityIndex=0;cityIndex<cityName.length;cityIndex++){
		   
		   if(cityName[cityIndex].equals(existingCity)){
		   
		   cityName[cityIndex] = updatedCity ;
		   isUpdated = true;
		   }
	   }
	   return isUpdated;
}
public static boolean DeletedCity(String existingCity,String DeletedCity){
	boolean isUpdated = false;
	for(int cityIndex = 0;cityIndex<cityName.length;cityIndex++);
	if(cityName[cityIndex].equals(existingCity)){
		cityName[cityIndex]=DeletedCity;
		isDeleted = true;
	}
	return isDeleted;
}