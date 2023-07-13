class Zomato {
	//purpose/functionality/behaviour
	public static double search(String foodName , int quantity){
		if("pizza" == foodName){
		System.out.println("Searched food name is = "+foodName);
		return 99.00 * quantity;
		}
		if("Veg Biryani" == foodName){
		System.out.println("Searched food name is = "+foodName);
			return 245.90  * quantity;
		}
		
		if("Mushroom Biryani" == foodName){
			System.out.println("Searched food name is = "+foodName);
			return 300.00  * quantity;
		}
		

		if("Vegfried Rice " == foodName){
			System.out.println("Searched food name is = "+foodName);
			return 80.00  * quantity;
		}
		
		
		if("Masala Dosa" == foodName){
			System.out.println("Searched food name is = "+foodName);
		    return 20.00  * quantity;
		
		}
		
		if("Kesari Bhath" == foodName){
			System.out.println("Searched food name is = "+foodName);
			return 30.00  * quantity;
		
		}
		if("Uppittu" == foodName){
			System.out.println("Searched food name is = "+foodName);
			return 30.00  * quantity;
		
		}
		if("Rice Bhath" == foodName){
			System.out.println("Searched food name is = "+foodName);
			return 35.00  * quantity;
		
		}
	
		return 0.0;	
		
		}
}