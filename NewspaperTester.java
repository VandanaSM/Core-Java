class NewspaperTester{

    public static void main(String[] args){
	  NewspaperDTO news=new NewspaperDTO();
	  news.setId(001);
	  news.setName("Deccan Herald");
	  news.setType("Daily newspaper");
	  news.setLanguage("English");
	  news.toShareNews();
	  
	  System.out.println(news.getId() + " " + news.getName() + " " + news.getType() + " " +  news.getLanguage());
	  
  }


}