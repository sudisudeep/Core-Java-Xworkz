public class RadioTester {
    public static void main(String[] args) {
        Radio radio1 = new Radio();
        radio1.type = "FM Radio";
        radio1.author = "Sony";
        radio1.price = 39.99;
        radio1.publicationLane = "Electronics Street";
        radio1.noOfPages = 0;
        System.out.println("Type: " + radio1.type);
        System.out.println("Author: " + radio1.author);
        System.out.println("Price: $" + radio1.price);
        System.out.println("Publication Lane: " + radio1.publicationLane);
        System.out.println("Number of Pages: " + radio1.noOfPages);
        radio1.listen();

        Radio radio2 = new Radio();
        radio2.type = "AM Radio";
        radio2.author = "Philips";
        radio2.price = 29.99;
        radio2.publicationLane = "Electronics Street";
        radio2.noOfPages = 0;
        System.out.println("Type: " + radio2.type);
        System.out.println("Author: " + radio2.author);
        System.out.println("Price: $" + radio2.price);
        System.out.println("Publication Lane: " + radio2.publicationLane);
        System.out.println("Number of Pages: " + radio2.noOfPages);
        radio2.listen();
    }
}