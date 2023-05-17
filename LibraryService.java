package library;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Iterator;
public class LibraryService{
	 String libraryName;
     String address;
     List<Book>   books;// A library has one or more books
	public LibraryService(String libraryName, String address, List<Book> books) {
		super();
		this.libraryName = libraryName;
		this.address = address;
		this.books = books;
	}
    
	public void showBooks()
	{
		Iterator itr = this.books.iterator();
		while(itr.hasNext())
		{
			Book b = (Book)itr.next();
			System.out.println(b.bookIsbnNo+"   "+b.author+"   "+b.publisher+"   "+b.price);
		}
		askOptions();
	}
	
	public void addNewBook()
	{
		System.out.println("To add a new book, enter the details-");
		System.out.println("Enter the ISBN number");
		Scanner in = new Scanner(System.in);
		int isbn = in.nextInt();
		
		System.out.println("Enter the Auther's name");
		Scanner in2 = new Scanner(System.in);
		String author = in2.nextLine();
		
		System.out.println("Enter the Publisher's name");
		Scanner in3 = new Scanner(System.in);
		String publisher = in3.nextLine();
		
		System.out.println("Enter the Price");
		Scanner in4 = new Scanner(System.in);
		float price = in4.nextFloat();
		
		Book b = new Book(isbn, author, publisher, price);
		
		this.books.add(b);
		
		askOptions();
	}
	
	public void deleteBook()
	{
		System.out.println("To delete an item enter the ISBN number");
		Scanner input = new Scanner(System.in);
        int isbnToBeDeleted = input.nextInt();
        ListIterator<Book> itr = this.books.listIterator();
        for(Book it:books)
        {
        	itr.next();
        	if(it.bookIsbnNo == isbnToBeDeleted)
        	{
        		break;
        	}
        }
        itr.remove();
		
        askOptions();
	}
	
	public String getCostlyBook()
	{
		return null;
	}
	
	public void askOptions()
	{
		System.out.println("Enter user type- 1. Admin, 2. Customer");
		Scanner in = new Scanner(System.in);
		int user = in.nextInt();
		System.out.println("User selected-"+user);
		
		if(user==1)// Admin
		{
			System.out.println("Enter choice- 1. view all books, 2. addNewBook, 3. deleteBook, 4. Get the costly book based on publisher");
			
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			switch(choice)
			{
			case 1:
				this.showBooks();
				break;
			case 2:
				this.addNewBook();
				break;
			case 3:
				this.deleteBook();
			    break;
			case 4:
				this.getCostlyBook();
				break;
			default:
				System.out.println("Default case");
			}
			
		}
	}
     
}
