import java.util.Scanner;

class AirportCrudTester{

  public static void main(String[] args){
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number of Terminals ");
	  int size=sc.nextInt();
	  
	  AirportCrud air=new AirportCrud(size);
	  
	  for(int i=0;i<size;i++){
	  TerminalDto dto=new TerminalDto();
	  	  System.out.println("Enter Terminal id");
		  int id=sc.nextInt();
		  System.out.println("Enter noOfBookingCounters");
		  int noOfBookingCounters=sc.nextInt();
		  System.out.println("Enter noOfShops ");
		  int noOfShops=sc.nextInt();
		  System.out.println("Emter noOfCheckInCounters");
		  int noOfCheckInCounters=sc.nextInt();
		  System.out.println("Enter noOfBaggageCounters");
		  int noOfBaggageCounters=sc.nextInt();
			  dto.setId(id);
			  dto.setNoOfBookingCounters(noOfBookingCounters);
			  dto.setNoOfShops(noOfShops);
			  dto.setNoOfCheckInCounters(noOfCheckInCounters);
			  dto.setNoOfBaggageCounters(noOfBaggageCounters);
	  
	  
	   air.createTerminalDetails(dto);
	  }
	  air.getPassengerDetails();
  }

}