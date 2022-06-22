class BookMyMovieTester{

   public static void main(String a[]){
     String movie[]={"Om","Gaalipata","A","Upendra","H2O","Rakta kanniru","Suryavanshi","Yajamana"};
	 String snack[]={"Samosa","salted popcorn","chilly popcorn","cheese popcorn","coke"};
    BookMyMovie bookMyShow =new BookMyMovie("Navrang",400,movie,snack);
	bookMyShow.showTime(20,"Devi", "Om");
	bookMyShow.buySnacks("Samosa",20,90);
   
   }

}