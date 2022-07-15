import java.util.Scanner;

class LibraryTester{

  public static void main(String[] args){
   
    Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number of books");
	  int size=sc.nextInt();
	  
	LibraryCrud lib=new LibraryCrud(size);
	
	 for(int i=0;i<size;i++){
	  BookDTO dto=new BookDTO();
	
      System.out.println("Enter book id");
	  int id=sc.nextInt();
	  System.out.println("Enter book name");
	  String name=sc.next();
	  System.out.println("Enter author of the book");
	  String author=sc.next();
	  System.out.println("Enter year of book published");
	  String bookPublishedYear=sc.next();
	  System.out.println("Enter book publisher");
	  String bookPublisher=sc.next();
	 
	   dto.setId(id);
	   dto.setName(name);
	   dto.setAuthor(author);
	   dto.setBookPublishedYear(bookPublishedYear);
	   dto.setBookPublisher(bookPublisher);
	   
	   lib.createBook(dto);
	}
       lib.getBookDetails();
	   
	    
		 //invoking updateBookNameById() 
		 System.out.println("Enter the existing id ");
		 int existingId=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter the book name to be updated");
		 String updatedName=sc.next();
		 lib.updateBookNameById(existingId,updatedName);
		 
		 lib.getBookDetails();
		 
	 ///invoking updateBookPublisherByName()
		 System.out.println("Enter the existing name ");
		 String existingName=sc.next();
		 //sc.nextLine();
		 System.out.println("Enter the book publisher to be updated");
		 String updatedBookPublisher=sc.next();
		// sc.nextLine();
		 lib.updateBookPublisherByName(existingName,updatedBookPublisher); 
         
		 lib.getBookDetails();

        //invoking deleteBookById()
         System.out.println("Enter the id to be deleted");
         int existingId1=sc.nextInt();
         lib.deleteBookDetailsById(existingId1);

         lib.getBookDetails();	

     ///invoking deleteBookByName()		
		 System.out.println("Enter the name to be deleted");
		 String availableName=sc.next();
		 lib.deleteBookDetailsByName(availableName);
		 
		 lib.getBookDetails(); 

    		 
  }

}