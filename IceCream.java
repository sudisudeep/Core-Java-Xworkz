class IceCream{
     static int index;
    //String flavourName={"venila","chocolate","mango","cherry","strawberry","pineapple"};
    static String flavourName[] ={null,null,null,null,null,null};

     public static void getFlavours(){

        for(int flavour =0;flavour<flavourName.length;flavour++){
            String name = flavourName[flavour];
            System.out.println(name);
        }
    }
    public static boolean saveflavour(String flavour){
        boolean isSaved=false;
        if(flavour !=null){
        flavourName[index++] = flavour ;
        isSaved=true;
        }
        else{
            System.out.println("cannot add flavour , it is null");
        }
		return isSaved;
    }
	
	public static boolean updateFlavour(String existingFlavour , String updatedFlavour){
	   
	   boolean isUpdated=false;
	   for(int flavourIndex=0;flavourIndex<flavourName.length;flavourIndex++){
		   
		   if(flavourName[flavourIndex].equals(existingFlavour)){
		   
		   flavourName[flavourIndex] = updatedFlavour ;
		   isUpdated = true;
		   }
	   }return isUpdated;
}   
}