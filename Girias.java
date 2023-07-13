class Girias{
	public static void main(String args[]){
		System.out.println("Main started");
		String electronicDevices[]={"refrigerator","washing Machine","Television","LED","Grinder","Ac","Ironbox","Microwave"};
		
		System.out.println(electronicDevices[0]+" "+electronicDevices[1]);
		System.out.println(" ");
		System.out.println("List of Electronic Devices Are = ");
		System.out.println(" ");
		for(int i=0 ; i < electronicDevices.length;i++){
			System.out.println(electronicDevices[i]);
			i++;
		}
		System.out.println("Main Ended");
	}

}