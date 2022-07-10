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
  }

}