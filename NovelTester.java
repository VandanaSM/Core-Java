class NovelTester{

    public static void main(String[] args){
	  Novel nov=new Novel();
	  nov.setId(001);
	  nov.setName("Rich dad poor dad");
	  nov.setType("economics");
	  nov.setAuthor("kiyosaki");
	  nov.toShapeBrains();
	  
	  System.out.println(nov.getId() + " " + nov.getName() + " " + nov.getType() + " " +  nov.getAuthor());
	  
  }


}