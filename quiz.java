import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String tittle;
    String author;
    double price;

    public Book(String tittle, String author) {
        this.author = author;
        this.tittle = tittle;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTittle() {
        return tittle;
    }

    @Override
    public String toString() {
        return "{[Tittle: " + tittle + "] \n" + "Author: " + author + "\n" + "Price: " + price + '}' + "\n";
    }

}

class Bookstore {
    private ArrayList<Book> BookManagement = new ArrayList<>();

    public void addBook(String Tittle, String author, double price) {
        Book book = new Book(Tittle, author);
        book.setPrice(price);
        BookManagement.add(book);

    }

    public void updateBookPrice(String title, double price) {
        for (Book book : BookManagement) {
            if (title.equals(book.getTittle())) {
                book.setPrice(price);
                return;
            }
        }
        System.out.println("Book not Found");
    }

    public void displayAllBookDetails() {
        if (BookManagement.isEmpty()) {
            System.out.println("There are no books Data");
        } else {
            for (Book book : BookManagement) {
                System.out.println(book);
            }
        }
    }
}

public class quiz {
    private static Bookstore bookstore = new Bookstore();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bookstore management System");
        option();
    }

    public static void option() {
        int option = 0;

        while (option != 4) {
            System.out.println("[1] Add Book");
            System.out.println("[2] Update Book Price");
            System.out.println("[3] Display all Book Detail's");
            System.out.println("[4] Exit");
            System.out.print("Option: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Enter Tittle: ");
                    String tittle = sc.nextLine();
                    System.out.print("Book Author: ");
                    String author = sc.nextLine();
                    System.out.print("Prize: ");
                    double price = sc.nextDouble();
                    bookstore.addBook(tittle, author, price);
                    break;
                case 2:
                    System.out.print("Tittle: ");
                    String titt = sc.nextLine();
                    System.out.print("Enter prize: ");
                    double pppp = sc.nextDouble();

                    bookstore.updateBookPrice(titt, pppp);
                    break;
                case 3:
                    System.out.println("All Book Details");
                    bookstore.displayAllBookDetails();
                    break;
                case 4:
                    System.out.println("Exiting.. . . .. ");
                default:
                    System.out.println("Invalid Input!");
                    break;
            }

        }

    }

}
