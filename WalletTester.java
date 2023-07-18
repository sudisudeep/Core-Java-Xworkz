class WalletTester {
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet();
        wallet1.type = "Bifold";
        wallet1.brand = "Louis Vuitton";
        wallet1.price = 500.0;
        wallet1.material = "Leather";
        wallet1.cardSlots = 6;

        System.out.println("Wallet 1 Details:");
        System.out.println("Type: " + wallet1.type);
        System.out.println("Brand: " + wallet1.brand);
        System.out.println("Price: $" + wallet1.price);
        System.out.println("Material: " + wallet1.material);
        System.out.println("Card Slots: " + wallet1.cardSlots);
        wallet1.storeMoney();
        wallet1.retrieveMoney();
        System.out.println();

        Wallet wallet2 = new Wallet();
        wallet2.type = "Trifold";
        wallet2.brand = "Gucci";
        wallet2.price = 300.0;
        wallet2.material = "Leather";
        wallet2.cardSlots = 8;

        System.out.println("Wallet 2 Details:");
        System.out.println("Type: " + wallet2.type);
        System.out.println("Brand: " + wallet2.brand);
        System.out.println("Price: $" + wallet2.price);
        System.out.println("Material: " + wallet2.material);
        System.out.println("Card Slots: " + wallet2.cardSlots);
        wallet2.storeMoney();
        wallet2.retrieveMoney();
        System.out.println();
    }
}