class MemoryCard {
	
    static String brand = "SanDisk";
    static String capacity = "64GB";
    static String format = "microSD";
    static String speedClass = "Class 10";
    static boolean isCompatibleWithSDAdapter = true;
	static String Material ="Plastic";

    public static void main(String[] args) {
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity);
        System.out.println("Format: " + format);
        System.out.println("Speed Class: " + speedClass);
        System.out.println("Is Compatible with SD Adapter: " + isCompatibleWithSDAdapter);
		System.out.println("Material= " +Material);
    }
}
