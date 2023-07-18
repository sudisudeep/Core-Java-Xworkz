class JewalarryTester{
	
	
	public static void main(String s[]){															
	 
		Jewalarry Jewalarry = new Jewalarry();
		Jewalarry.name = "kalyan";
		Jewalarry.design = "flower";
		Jewalarry.pattern = "square";
		Jewalarry.work = "hand";
		Jewalarry.price = 50000;
		Jewalarry.toWear();
		System.out.println(Jewalarry.name + ", "+ Jewalarry.design + ", "+ Jewalarry.pattern + ", "+ Jewalarry.work + ", "+ Jewalarry.price);
	
		
		Jewalarry Jewalarry1 = new Jewalarry();
		Jewalarry1.name = "giva";
		Jewalarry1.design = "peacock";
		Jewalarry1.pattern = "square";
		Jewalarry1.work = "machine";
		Jewalarry1.price = 50000;
		Jewalarry1.toWear();
		System.out.println(Jewalarry1.name + ", "+ Jewalarry1.design + ", "+ Jewalarry1.pattern + ", "+ Jewalarry1.work + ", "+ Jewalarry1.price);
    }
}
	