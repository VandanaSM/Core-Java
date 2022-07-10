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
  
  




}