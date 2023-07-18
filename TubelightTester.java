class TubelightTester {
    public static void main(String[] args) {
        TubeLight tubelight1 = new TubeLight();
        tubelight1.type = "LED";
        tubelight1.brand = "Philips";
        tubelight1.price = 19.99;
		tubelight1.material = "glass";
		tubelight1.voltage = "20 watts";
        tubelight1.illuminate();
		
        System.out.println("Type: " + tubelight1.type);
        System.out.println("Brand: " + tubelight1.brand);
        System.out.println("Price: $" + tubelight1.price);
		System.out.println("material: " + tubelight1.material);
        System.out.println("voltage: " + tubelight1.voltage);
        System.out.println();

        TubeLight tubelight2 = new TubeLight();
        tubelight2.type = "Fluorescent";
        tubelight2.brand = "Sylvania";
        tubelight2.price = 12.99;
		tubelight2.material = "glass";
		tubelight2.voltage = "200 watts";
        tubelight2.illuminate();
        System.out.println("Type: " + tubelight2.type);
        System.out.println("Brand: " + tubelight2.brand);
        System.out.println("Price: $" + tubelight2.price);
		System.out.println("material: " + tubelight2.material);
        System.out.println("voltage: " + tubelight2.voltage);
        System.out.println();
    }
}