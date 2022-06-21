class Theatre1{
  String name;
  String address;
  long contactNo;
  String ownerName;
  //String[] runningMoviesInVeeresh={"Charlie 777","Vikram"};
  //String[] runningMoviesInUrvashi={"Bhool Bhulayya 2","KGF 2"};    
  //array variables must be declared once and data must be added using refvariable while creating object
  String runningMovies[]= new String[3];
  
  public Theatre1(){
	  System.out.println("object Theatre1 is created");
  }
  public static void main(String[] args){
    //className refVariable= className();
	Theatre1 theatre=new Theatre1();
	   theatre.name="Veeresh";
	   theatre.address="Magadi Road";
	   theatre.contactNo=8098098099L;
	   theatre.ownerName="xyz";
	   theatre.runningMovies[0]="Vikram";
	   theatre.runningMovies[1]="Charlie";
	   theatre.runningMovies[2]="bhool bhulaiya 2";
	   theatre.entertainment();
	   System.out.println("the theatre name is" +theatre.name);
	   System.out.println("the address of theatre is "+theatre.address);
	   System.out.println("the contact no is " +theatre.contactNo);
	   System.out.println("the owner of the theatre is "+theatre.ownerName);
	   System.out.println("the movies running in " +theatre.name  +" are ");
	   theatre.getRunningMovies();
	   
	Theatre1 theatre1=new Theatre1();
	    theatre1.name="Urvashi";
		theatre1.address="Sudhama nagar";
		theatre1.contactNo=6897095878L;
		theatre1.ownerName="abc";
		theatre1.runningMovies[0]="beast";
		theatre1.runningMovies[1]="om";
		theatre1.runningMovies[2]="kgf 2";
	
	   System.out.println("the theatre name is" +theatre.name);
	   System.out.println("the address of theatre is "+theatre.address);
	   System.out.println("the contact no is " +theatre.contactNo);
	   System.out.println("the owner of the theatre is "+theatre.ownerName);
	   System.out.println("the movies running in " + theatre1.name +" are ");
	   theatre1.getRunningMovies();//theatre.runningMovies[]={"Charlie 777","Vikram"};
		
		

		
  }
  
  public void getRunningMovies(){
	   for(int z=0;z<runningMovies.length;z++){
		  System.out.println(runningMovies[z]);   //to print all movies names in single line remove ln from println
	  }
    }

	public void entertainment(){
		System.out.println("theatres entertain people");
	}


}