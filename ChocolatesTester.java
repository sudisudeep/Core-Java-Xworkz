public class ChocolatesTester {
    
    public static void main(String[] args){

        Chocolates chocolates = new Chocolates();
        chocolates.name = "DairyMilk";
        chocolates.flovor = "CHOCOLATE";
        chocolates.price = 50;
        chocolates.quantity = "1";
        chocolates.mfgDate = "25/03/2023";
        chocolates.expDate = "23/03/2025";
        chocolates.color = "Dark brown";

        System.out.println(chocolates.name + " " + chocolates.flovor + " " + chocolates.price + " " + chocolates.quantity + " " + chocolates.mfgDate + " " + chocolates.expDate + " " + chocolates.color);

        Chocolates chocolates1 = new Chocolates();
        chocolates1.name = "DarkFantasy";
        chocolates1.flovor = "CHOCOLATE";
        chocolates1.price = 60;
        chocolates1.quantity = "1";
        chocolates1.mfgDate = "25/03/2023";
        chocolates1.expDate = "23/03/2025";
        chocolates1.color = "Dark Black";

        System.out.println(chocolates1.name + " " + chocolates1.flovor + " " + chocolates1.price + " " + chocolates1.quantity + " " + chocolates1.mfgDate + " " + chocolates1.expDate + " " + chocolates1.color);
    }
}
