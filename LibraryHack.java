package library;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class LibraryHack {

	public static void main(String[] args) {
    
		Book b1 = new Book(1, "Alex", "Acomp", 1000);
		Book b2 = new Book(2, "Bob", "Bcomp", 2000);
		Book b3 = new Book(3, "Cian", "Ccomp", 3000);
		Book b4 = new Book(4, "Dan", "Dcomp", 4000);
		Book b5 = new Book(5, "Elite", "Ecomp", 5000);
		
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		
		LibraryService lib = new LibraryService("Just Reading Library", "India", books);
		
		lib.askOptions();
		


	}

}
