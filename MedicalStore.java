class MedicalStore{
    static int index;
    //String medicineName[]={"aspirin","dolo","paracetamol","cyclizine","acetaminophen","phenylphrine","vicks","citrizine","rantac"};
    static String medicineName[]={null,null,null,null,null,null,null,null,null};

    public static void getMedicineName(){
        for(int medicine=0 ;medicine<medicineName.length;medicine++){
            String name = medicineName[medicine];
            System.out.println(name);
        }
    }
    public static boolean addMedicine(String medicine){
        boolean isAdded=false;
        if(medicine !=null){
            medicineName[index++] = medicine;
            isAdded=true;
        }
        else {
            System.out.println("cannot add medicine,it is null");
        }
		return isAdded;
    }
	
	public static boolean updateMedicine(String existingMedicine , String updatedMedicine){
	   
	   boolean isUpdated=false;
	   for(int medicineIndex=0;medicineIndex<medicineName.length;medicineIndex++){
		   
		   if(medicineName[medicineIndex].equals(existingMedicine)){
		   
		   medicineName[medicineIndex] = updatedMedicine ;
		   isUpdated = true;
		   }
	   }return isUpdated;
}    
}