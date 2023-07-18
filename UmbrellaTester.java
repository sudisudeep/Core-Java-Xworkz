class UmbrellaTester {
    public static void main(String[] args) {
        Umbrella umbrella1 = new Umbrella();
        umbrella1.type = "Compact";
        umbrella1.color = "Black";
        umbrella1.price = 19.99;
        umbrella1.size = 42;
		

        System.out.println("Umbrella 1 Details:");
        System.out.println("Type: " + umbrella1.type);
        System.out.println("Color: " + umbrella1.color);
        System.out.println("Price: $" + umbrella1.price);
        System.out.println("Size: " + umbrella1.size + " inches");
        //umbrella1.open();
        //umbrella1.close();
        System.out.println();

        Umbrella umbrella2 = new Umbrella();
        umbrella2.type = "Folding";
        umbrella2.color = "Blue";
        umbrella2.price = 24.99;
        umbrella2.size = 46;

        System.out.println("Umbrella 2 Details:");
        System.out.println("Type: " + umbrella2.type);
        System.out.println("Color: " + umbrella2.color);
        System.out.println("Price: $" + umbrella2.price);
        System.out.println("Size: " + umbrella2.size + " inches");
        //umbrella2.open();
        //umbrella2.close();
        System.out.println();
    }
}