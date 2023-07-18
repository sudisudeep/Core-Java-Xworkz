class TrolleyTester {
    public static void main(String[] args) {
        Trolley trolley1 = new Trolley();
        trolley1.type = "Carry-On";
        trolley1.brand = "Samsonite";
        trolley1.price = 150.0;
        trolley1.capacity = 30;
		trolley1.width= 20;
		

        System.out.println("Trolley 1 Details:");
        System.out.println("Type: " + trolley1.type);
        System.out.println("Brand: " + trolley1.brand);
        System.out.println("Price: $" + trolley1.price);
        System.out.println("Capacity: " + trolley1.capacity + " kg");
		System.out.println("width: " + trolley1.width + " cm");
        trolley1.roll();
        trolley1.stop();
        System.out.println();

        Trolley trolley2 = new Trolley();
        trolley2.type = "Checked";
        trolley2.brand = "Delsey";
        trolley2.price = 200.0;
        trolley2.capacity = 60;
		trolley2.width= 27;

        System.out.println("Trolley 2 Details:");
        System.out.println("Type: " + trolley2.type);
        System.out.println("Brand: " + trolley2.brand);
        System.out.println("Price: $" + trolley2.price);
        System.out.println("Capacity: " + trolley2.capacity + " kg");
		System.out.println("width: " + trolley2.width + " cm");
        trolley2.roll();
        trolley2.stop();
        System.out.println();
    }
}