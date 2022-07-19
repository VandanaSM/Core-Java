interface LibraryCrud{
  
  boolean createBook(BookDTO dto);
  void getBookDetails();
  boolean updateBookNameById(int id,String name);
  boolean updateBookPublisherByName(String name,String bookPublisher);
  boolean deleteBookDetailsById(int id);
  boolean deleteBookDetailsByName(String name);


}