class BookDTO{

  private int id;
  private String name;
  private String author;
  private String bookPublishedYear;
  private String bookPublisher;
  
  public BookDTO(){
	  System.out.println("BookDTO object created");
  }
  
  public int getId(){
	return id;  
  }
  
  public void setId(int id){
	  this.id=id;
  }
  
  public String getName(){
	  return name;
  }
  
  public void setName(String name){
	  this.name=name;
  }
  
  public String getAuthor(){
	  return author;
  }
  
  public void setAuthor(String author){
	  this.author=author;
  }
  
  public String getBookPublishedYear(){
	  return bookPublishedYear;
  }
  
  public void setBookPublishedYear(String bookPublishedYear){
	  this.bookPublishedYear=bookPublishedYear;
  }
  
  public String getBookPublisher(){
	  return bookPublisher;
  }
  
  public void setBookPublisher(String bookPublisher){
	  this.bookPublisher=bookPublisher;
  }
}