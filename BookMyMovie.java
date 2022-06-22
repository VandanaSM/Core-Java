class BookMyMovie{
	
	String theatreName;
	String movie[];
	int noOfTickets;
	static int ticketPrice=600;
	int totalNoOfTickets;
	int totalTicketPrice;
	String snack[];
	int totalSnacks=100;
	static int snackPrice=60;
	int snackQuantity;
	
	public BookMyMovie(String theatreName,int totalNoOfTickets,String movie[],String snack[]){        //constructor
	  System.out.println("BookMyMovie object is created");	
	  this.theatreName=theatreName;
	  this.totalNoOfTickets=totalNoOfTickets;
	  this.movie=movie;
	  this.snack=snack;
	 
	}
	
	
	public int showTime(int noOfTickets,String bookedBy,String movieName){     /////user class(bookmymovietester) is created to keep the logic secure 
		int totalTicketPrice=0;  ///it is local var now so we need to init and declare and return the value 
		System.out.println("Arg 1: No of tickets " +noOfTickets);
		System.out.println("Arg 2: Booked by " +bookedBy);
		System.out.println("Arg 3: movie name " +movieName);

		for(int index=0;index<movie.length;index++){
			
			if(movie[index]==movieName){
				System.out.println("movie name matched");
				
		    if(noOfTickets<totalNoOfTickets){
			totalTicketPrice=noOfTickets*ticketPrice;
			totalNoOfTickets=totalNoOfTickets-noOfTickets;
			System.out.println(" For movie :" + movieName + "  No of tickets that are remaining are " + totalNoOfTickets +
			                   " Total price is "+ totalTicketPrice);
			}
			else{
				System.out.println("ishtu tickets illa");
			
			}
			}
			else{
				System.out.println("movie not available");
			}
			
			
			
		}
		
		return totalTicketPrice;
	}
	
    public int buySnacks(String snackName,int snackQuantity,int giveSeatNo){
		int totalSnackPrice=0;   //logic for getting snacks and snack price
	    System.out.println("arg 1 : snack Name " +snackName);
		System.out.println("arg 2 : snack quantity " +snackQuantity);
        System.out.println("arg 3 : seat number at which ordered snack has to given is " +giveSeatNo);
		
		for(int i=0;i<snack.length;i++){
			if(snack[i]==snackName){
				System.out.println("The snack is available");
			
			if(snackQuantity<totalSnacks){
				totalSnackPrice=snackQuantity*snackPrice;
				totalSnacks=totalSnacks-snackQuantity;
				
				
				System.out.println("For " + snackName + " no of snacks remaining are " + totalSnacks +
                    				" total price of snacks is " + totalSnackPrice);
				
			}
			else{
				System.out.println("The mentioned Snack is out of stock please look into other snacks to order");
			}
			}
			else{
				System.out.println("The snack is not available");
			}
			
			
		}

	return totalSnackPrice;
	}

}