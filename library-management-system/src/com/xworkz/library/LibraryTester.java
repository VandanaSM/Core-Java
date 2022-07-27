package com.xworkz.library;

import java.util.Scanner;

import com.xworkz.library.crud.Library;
import com.xworkz.library.crud.impl.LibraryCrudImpl;
import com.xworkz.library.dto.BookDTO;

public class LibraryTester {
  
  public static void main(String[] args) {
	 
	 Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number of books");
	  int size=sc.nextInt();
	  
	  Library lib=new LibraryCrudImpl(size);
	  
	  for(int i=0;i<size;i++) {
		  BookDTO dto = new BookDTO();  
	  
	  System.out.println("Enter the id of the book");
	  int id=sc.nextInt();
	  
	  System.out.println("Enter the name of the book");
	  String name=sc.next();
	  
	  System.out.println("Enter the author of the book");
	  String author=sc.next();
	  
	  System.out.println("Enter the book published year");
	  String bookPublishedYear=sc.next();
	  
	  System.out.println("Enter the book publisher");
	  String bookPublisher=sc.next();
	  
	  dto.setId(id);
	  dto.setName(name);
	  dto.setAuthor(author);
	  dto.setBookPublishedYear(bookPublishedYear);
	  dto.setBookPublisher(bookPublisher);
	  
	   lib.createBook(dto);
	}
	  String option=null;
	  do {
		  System.out.println("Enter 1 to getBookDetails ");
		  System.out.println("Enter 2 to updateBookNameById");
		  System.out.println("Enter 3 to updateBookPublisherByName");
		  System.out.println("Enter 4 to deleteBookById");
		  System.out.println("Enter 5 to deleteBookByName");
		  System.out.println("Enter the choice to proceed");
			
			int choice=sc.nextInt();
			
	 switch(choice) {
	 case 1: lib.getBookDetails();
	         break;
	 case 2: System.out.println("Enter the existing id ");
			 int existingId=sc.nextInt();
			 sc.nextLine();
			 System.out.println("Enter the book name to be updated");
			 String updatedName=sc.next();
			 lib.updateBookNameById(existingId,updatedName);
			 break;
	 case 3 :System.out.println("Enter the existing name ");
			 String existingName=sc.next();
			 //sc.nextLine();
			 System.out.println("Enter the book publisher to be updated");
			 String updatedBookPublisher=sc.next();
			// sc.nextLine();
			 lib.updateBookPublisherByName(existingName,updatedBookPublisher); 
			 break;
	 case 4: System.out.println("Enter the id to be deleted");
		     int existingId1=sc.nextInt();
		     lib.deleteBookDetailsById(existingId1);
		     break;
	 case 5:System.out.println("Enter the name to be deleted");
			 String availableName=sc.next();
			 lib.deleteBookDetailsByName(availableName);
			 break;
	 default:  System.out.println("Please enter valid choices from above");
             break;
}

System.out.println("Do you want to continue further Yes/No");
option =sc.next();
sc.close();
}

while(option.equalsIgnoreCase("Yes"));
}
} 

