class PrintersTester {
    public static void main(String[] args) {
        Printers printers1 = new Printers();
        printers1.brand = "HP";
        printers1.model = "OfficeJet Pro 9015";
        printers1.price = 199.99;
        printers1.print();
        System.out.println("Brand: " + printers1.brand);
        System.out.println("Model: " + printers1.model);
        System.out.println("Price: $" + printers1.price);
        System.out.println();

        Printers printers2 = new Printers();
        printers2.brand = "Epson";
        printers2.model = "WorkForce WF-2750";
        printers2.price = 129.99;
        printers2.print();
        System.out.println("Brand: " + printers2.brand);
        System.out.println("Model: " + printers2.model);
        System.out.println("Price: $" + printers2.price);
        System.out.println();
    }
}