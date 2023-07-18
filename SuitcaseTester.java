class SuitcaseTester {
    public static void main(String[] args) {
        Suitcase suitcase1 = new Suitcase();
        suitcase1.type = "Carry-On";
        suitcase1.brand = "Samsonite";
        suitcase1.price = 150.0;
        suitcase1.color9 = "Black";
        suitcase1.capacity = 30;

        System.out.println("Suitcase 1 Details:");
        System.out.println("Type: " + suitcase1.type);
        System.out.println("Brand: " + suitcase1.brand);
        System.out.println("Price: $" + suitcase1.price);
        System.out.println("Color: " + suitcase1.color);
        System.out.println("Capacity: " + suitcase1.capacity + " liters");
        suitcase1.pack();
        suitcase1.unpack();
        System.out.println();

        Suitcase suitcase2 = new Suitcase();
        suitcase2.type = "Checked";
        suitcase2.brand = "Delsey";
        suitcase2.price = 200.0;
        suitcase2.color = "Blue";
        suitcase2.capacity = 60;

        System.out.println("Suitcase 2 Details:");
        System.out.println("Type: " + suitcase2.type);
        System.out.println("Brand: " + suitcase2.brand);
        System.out.println("Price: $" + suitcase2.price);
        System.out.println("Color: " + suitcase2.color);
        System.out.println("Capacity: " + suitcase2.capacity + " liters");
        suitcase2.pack();
        suitcase2.unpack();
        System.out.println();
    }
}