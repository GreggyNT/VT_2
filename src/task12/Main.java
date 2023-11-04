package task12;

import task16.AuthorComp;
import task16.NameComp;
import task16.PriceComp;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static TreeSet<Book> books;
    public static void main(String[] args) {
        books = new TreeSet<>();
        books.add(new Book("Book1", "a1", 5, 1));
        books.add(new Book("Book2", "a2", 8, 2));
        books.add(new Book("Book3", "a3", 6, 3));
        books.add(new Book("Book4", "a4", 15, 4));

        for(Book book:books)
            System.out.println(book.toString());

        ArrayList<Comparator<Book>> comparators = new ArrayList<Comparator<Book>>();
        comparators.add(new NameComp());
        comparators.add((new NameComp()).thenComparing(new AuthorComp()));
        comparators.add((new AuthorComp()).thenComparing(new NameComp()));
        comparators.add(((new AuthorComp()).thenComparing(new NameComp())).thenComparing(new PriceComp()));
        ArrayList<Book> books2 = new ArrayList<>();
        books2.addAll(books);
        for (Comparator<Book> comparator: comparators) {
            books2.sort(comparator);
            System.out.println("\nSorted array of books: ");
            for (Book book: books2) {
                System.out.println(book.toString());
            }
        }

    }
}