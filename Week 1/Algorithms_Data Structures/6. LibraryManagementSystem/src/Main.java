import java.util.*;
public class Main
{
    public Book searchBookByTitleLinear(List<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    public Book searchBookByTitleBinary(List<Book> books, String title) {
        int left = 0;
        int right = books.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books.get(mid);

            int comparison = midBook.getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        // Create a sample list of books
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Lord of the Rings", "J.R.R. Tolkien"));
        books.add(new Book(2, "Pride and Prejudice", "Jane Austen"));
        books.add(new Book(3, "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book(4, "The Great Gatsby", "F. Scott Fitzgerald"));

        // Search for a book using linear search
        String searchTitleLinear = "Pride and Prejudice";
        Book foundBookLinear = new Main().searchBookByTitleLinear(books, searchTitleLinear);
        if (foundBookLinear != null) {
            System.out.println("Found book using linear search: " + foundBookLinear);
        } else {
            System.out.println("Book not found using linear search for title: " + searchTitleLinear);
        }

        // Search for a book using binary search (assuming the list is sorted by title)
        String searchTitleBinary = "The Great Gatsby";
        Book foundBookBinary = new Main().searchBookByTitleBinary(books, searchTitleBinary);
        if (foundBookBinary != null) {
            System.out.println("Found book using binary search: " + foundBookBinary);
        } else {
            System.out.println("Book not found using binary search for title: " + searchTitleBinary);
        }
    }
}