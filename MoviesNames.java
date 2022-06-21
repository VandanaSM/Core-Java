class MoviesNames{

 static String movies[]={"Charlie 777","Bhool bhulayya 2","Vikram","Pruthviraj","KGF 2",};
 
 public static void main(String[] args){
 
  getMovies();                            ///to print all the movie names
  String value=getMovie("Lagaan");        //we want to get any one movie name as search result from book my show
  System.out.println("Come lets watch " +value);
   value=getMovie1("Charlie 777");
  System.out.println("come lets watch " +value);
 
 }
 
 public static void getMovies(){
	System.out.println("List of movies are******");
    for(int i=0;i<movies.length;i++){
	   System.out.println(movies[i]);
	
	}
 
 }
 
 public static String getMovie(String movie){    //parameters and argumets inside getmovie method should be same string movie=kgf 2
	 String movieName=null;
	 for(int i=0;i<movies.length;i++){
		 if(movies[i]==movie){                  //movie[4]=movie=kgf 2
			 movieName=movie;
		 }else{
			 System.out.println(movie +"Movie is not available");      ///else part to have nagative scenarios
		 }
		 
		
	 }
	 
	return  movieName; 
 }
 
  public static void getMovie1(String movie){    //parameters and argumets inside getmovie method should be same string movie=kgf 2
	 String movieName=null;
	 for(int i=0;i<movies.length;i++){
		 if(movies[i]==movie){                  //movie[4]=movie=kgf 2
			 movieName=movie;
		 }else{
			 System.out.println(movie +"Movie is not available");      ///else part to have nagative scenarios
		 }
		 
		
	 }
	 
	
  }



}