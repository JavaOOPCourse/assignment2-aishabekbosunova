public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Библиотека переполнена.");
        }
    }

    // TODO: Display all books
    public void displayBooks() {
        if (count == 0) {
            System.out.println("В библиотеке нет книг.");
        }
        for (int i=0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for (int i=0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        Book book = searchByTitle(title);
        if (book != null) {
            book.borrowBook();
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        Book book = searchByTitle(title);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Книга не найдена.");
        }
    }
}
