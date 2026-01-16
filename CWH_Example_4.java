class Library {

    String[] books;       // available books
    String[] issuedBooks; // issued books
    int bookCount;
    int issuedCount;

    // Constructor
    Library() {
        books = new String[100];
        issuedBooks = new String[100];
        bookCount = 0;
        issuedCount = 0;
    }

    // Add a book
    void addBook(String book) {
        books[bookCount] = book;
        bookCount++;
        System.out.println("📚 Book added: " + book);
    }

    // Show available books
    void showAvailableBooks() {
        System.out.println("\n📖 Available Books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null) {
                System.out.println("- " + books[i]);
            }
        }
    }

    // Issue a book
    void issueBook(String book) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && books[i].equals(book)) {
                issuedBooks[issuedCount] = book;
                issuedCount++;
                books[i] = null;
                System.out.println("✅ Book issued: " + book);
                return;
            }
        }
        System.out.println("❌ Book not available");
    }

    // Return a book
    void returnBook(String book) {
        for (int i = 0; i < issuedCount; i++) {
            if (issuedBooks[i] != null && issuedBooks[i].equals(book)) {
                books[bookCount] = book;
                bookCount++;
                issuedBooks[i] = null;
                System.out.println("🔄 Book returned: " + book);
                return;
            }
        }
        System.out.println("❌ This book was not issued");
    }
}

public class CWH_Example_4 {
    public static void main(String[] args) {

        Library lib = new Library();

        lib.addBook("Java Programming");
        lib.addBook("Python Basics");
        lib.addBook("Data Structures");
        lib.addBook("Operating Systems");

        lib.showAvailableBooks();

        lib.issueBook("Java Programming");
        lib.issueBook("Python Basics");

        lib.showAvailableBooks();

        lib.returnBook("Java Programming");

        lib.showAvailableBooks();
    }
}
