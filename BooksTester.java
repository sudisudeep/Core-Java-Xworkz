public class BooksTester {
    
    public static void main(String[] args) {
        
        Books books = new Books();
        books.name = "To kill Moking bird";
        books.type = "Novel";
        books.author = "Harper Lee";
        books.price = 750;
        books.publicationName = "Harper collins Publications";
        books.noOfPages = 500;

        System.out.println(books.name + " " + books.type + " " + books.author + " " + books.price + " " + books.publicationName + " " + books.noOfPages);

        Books books1 = new Books();
        books1.name = "Game of Throns";
        books1.type = "Novel";
        books1.author = "George R";
        books1.price = 1000;
        books1.publicationName = "Harper collins Publications";
        books1.noOfPages = 5000;

        System.out.println(books1.name + " " + books1.type + " " + books1.author + " " + books1.price + " " + books1.publicationName + " " + books1.noOfPages);

        
        
    }
}
