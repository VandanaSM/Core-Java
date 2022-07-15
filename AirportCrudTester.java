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
	  
	  	//invoking updateNoOfBookingCountersById() 
		 System.out.println("Enter the existing id ");
		 int existingId=sc.nextInt();
		// sc.nextLine();
		 System.out.println("Enter the NoOfBookingCounters to be updated");
		 int updatedNoOfBookingCounters=sc.nextInt();
		 air.updateNoOfBookingCountersById(existingId,updatedNoOfBookingCounters);
		 
		  air.getPassengerDetails();
		 
	 ///invoking updateNoOfCheckInCountersById()
		 System.out.println("Enter the existing id ");
		 int existingId1=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter the NoOfCheckInCounters to be updated");
		 int updatedNoOfCheckInCounters=sc.nextInt();
		 //sc.nextLine();
		 air.updateNoOfCheckInCountersById(existingId1,updatedNoOfCheckInCounters); 
         
		 air.getPassengerDetails(); 
		 		 
		///invoking deleteTerminalById()		
		 System.out.println("Enter the id to be deleted");
		 int availableId=sc.nextInt();
		 air.deleteTerminalById(availableId);
		 
		 air.getPassengerDetails(); 
		 
		///invoking deleteTerminalByNoOfBookingCounters()		
		 System.out.println("Enter the noOfBookingCounters to be deleted");
		 int availableNoOfBookingCounters=sc.nextInt();
		 air.deleteTerminalByNoOfBookingCounters(availableNoOfBookingCounters);
		 
		 air.getPassengerDetails(); 
  }
  }
