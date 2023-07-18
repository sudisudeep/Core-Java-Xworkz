public class BeveragesTester {
    
    public static void main(String[] args){

        Beverages beverages = new Beverages();
        beverages.name = "KingFisher";
        beverages.type = "Beer";
        beverages.price = 120;
        beverages.quantity = 1;

        System.out.println(beverages.name + " " + beverages.type + " " + beverages.price + " " + beverages.quantity);

        Beverages beverages1 = new Beverages();
        beverages1.name = "Oldmonk";
        beverages1.type = "Hotdinks";
        beverages1.price = 70;
        beverages1.quantity = 1;

        System.out.println(beverages1.name + " " + beverages1.type + " " + beverages1.price + " " + beverages1.quantity);
    }
}
