import java.util.Arrays;

class LibraryCrud{

  BookDTO dtos[];
  int index;
  
  public LibraryCrud(int size){
    dtos=new BookDTO[size];
	System.out.println("Library object is created");
  }
  
  public boolean createBook(BookDTO dto){
	  System.out.println("createBook() started");
	   boolean isAdded=false;
	   if(dto!=null && dto.getName()!=null){
		   this.dtos[index++]=dto;
		   isAdded=true;
		   System.out.println("Book details created successfully ");
	   }
	   else{
		   System.out.println("add book details");
	   }
	  
	return isAdded;  
  }
  
  public void getBookDetails(){
	  System.out.println("getBookDetails() started");
	  for(int i=0;i<dtos.length;i++){
		  System.out.println(dtos[i].getId() + " " + dtos[i].getName() + " " + dtos[i].getAuthor() + 
		                     " " + dtos[i].getBookPublishedYear() + " " + dtos[i].getBookPublisher());
	  }
  }
  
    public boolean updateBookNameById(int id,String name){    
	  System.out.println("start of updateBookNameById()");
	  boolean updatedName=false;
	  for(int i=0;i<dtos.length;i++){      
		  if(dtos[i].getId()==id){        
			  updatedName=true;
			  dtos[i].setName(name);    
			  System.out.println("Book name updated successfully");
		  }
		  else{
			  System.out.println("Couldnot update book name,please provide proper id");
		  }
	  }
	  return updatedName;
  }
  
   public boolean updateBookPublisherByName(String name,String bookPublisher){
	  System.out.println("start of updateBookPublisherByName()");
	  boolean updatedBookPublisher=false;
	  for(int i=0;i<dtos.length;i++){
		  if(dtos[i].getName().equals (name)){
			  updatedBookPublisher=true;
			  dtos[i].setBookPublisher(bookPublisher);
			  System.out.println("Book publisher is updated successfully");
		  }
		  else{
			  System.out.println("Couldnot update book publisher details , please enter proper patient name");
		  }
	  }
	  return updatedBookPublisher;
  } 
  
   public boolean deleteBookDetailsById(int id){
	   System.out.println("start of deleteBookDetailsById()");
	   boolean BookDeleted=false;
	   int i,j;
	   for(i=0,j=0;j<dtos.length;j++){
		   if(dtos[j].getId()!=id){
			   dtos[i++]=dtos[j];
			   BookDeleted=true;
		   }
		   else{
			   System.out.println("Book id not found");
		   }
	   }
	   dtos=Arrays.copyOf(dtos,i);
	    return BookDeleted;
   }   
   
    public boolean deleteBookDetailsByName(String name){
	   System.out.println("start of deleteBookDetailsByName()");
	   boolean BookDeleted1=false;
	   int i,j;
	   for(i=0,j=0;j<dtos.length;j++){
		   if(!dtos[j].getName().equals(name)){
			   dtos[i++]=dtos[j];
			   BookDeleted1=true;
		   }
		   else{
			   System.out.println("Book id not found");
		   }
	   }
	   dtos=Arrays.copyOf(dtos,i);
	    return BookDeleted1;
   } 
  
	  }
  
  
  




