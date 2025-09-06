// Roll No: CCE22041
// Application: Library Management System (Inheritance Demonstration)

class LibraryItem {   // Base class (Single Inheritance)
    String title;
    String author;

    LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// --- Single Inheritance ---
class Book extends LibraryItem {
    String isbn;

    Book(String title, String author, String isbn) {
        super(title, author);
        this.isbn = isbn;
    }

    void showBook() {
        displayInfo();
        System.out.println("ISBN: " + isbn);
    }
}

// --- Multilevel Inheritance ---
class EBook extends Book {
    double fileSizeMB;

    EBook(String title, String author, String isbn, double fileSizeMB) {
        super(title, author, isbn);
        this.fileSizeMB = fileSizeMB;
    }

    void showEBook() {
        showBook();
        System.out.println("File Size: " + fileSizeMB + " MB");
    }
}

// --- Hierarchical Inheritance ---
class Magazine extends LibraryItem {
    int issueNumber;

    Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    void showMagazine() {
        displayInfo();
        System.out.println("Issue Number: " + issueNumber);
    }
}

// --- Hybrid Inheritance (via interfaces) ---
interface Borrowable {
    void borrowItem(String borrower);
}

class BorrowableBook extends Book implements Borrowable {
    boolean isBorrowed = false;

    BorrowableBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public void borrowItem(String borrower) {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " has been borrowed by " + borrower);
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }
}

// --- Main Class ---
public class CCE22041_LibraryInheritanceApp {
    public static void main(String[] args) {
        System.out.println("Roll No: CCE22041");
        System.out.println("=== LIBRARY MANAGEMENT APPLICATION (Inheritance Demo) ===\n");

        // Single Inheritance
        Book book = new Book("Java Basics", "James Gosling", "ISBN12345");
        System.out.println("-- Book Info (Single Inheritance) --");
        book.showBook();
        System.out.println();

        // Multilevel Inheritance
        EBook ebook = new EBook("Effective Java", "Joshua Bloch", "ISBN67890", 5.2);
        System.out.println("-- EBook Info (Multilevel Inheritance) --");
        ebook.showEBook();
        System.out.println();

        // Hierarchical Inheritance
        Magazine magazine = new Magazine("Tech World", "Editorial Team", 45);
        System.out.println("-- Magazine Info (Hierarchical Inheritance) --");
        magazine.showMagazine();
        System.out.println();

        // Hybrid Inheritance
        BorrowableBook borrowableBook = new BorrowableBook("Clean Code", "Robert C. Martin", "ISBN11223");
        System.out.println("-- Borrowable Book (Hybrid Inheritance) --");
        borrowableBook.showBook();
        borrowableBook.borrowItem("Alice");
        borrowableBook.borrowItem("Bob"); // Trying again
    }
}
