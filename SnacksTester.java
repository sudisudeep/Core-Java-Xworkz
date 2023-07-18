class SnacksTester {
    public static void main(String[] args) {
        Snacks snack1 = new Snacks();
        snack1.name = "Chips";
        snack1.quantity = 10;
        snack1.type = "Potato";
		snack1.quality = "good";
		snack1.price = 2;

        System.out.println("Snack 1 Details:");
        System.out.println("Name: " + snack1.name);
        System.out.println("Quantity: " + snack1.quantity);
        System.out.println("Type: " + snack1.type);
		System.out.println("Quality: " + snack1.quality);
        System.out.println("price: " + snack1.price);
        snack1.eat();
        System.out.println();
    }
}
