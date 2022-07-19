import java.util.Scanner;

class AirportCrudTester{

  public static void main(String[] args){
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number of Terminals ");
	  int size=sc.nextInt();
	  
	  AirportCrudImpl air=new AirportCrudImpl(size);
	  
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
	  
	  	 String option=null;
	  do{
		System.out.println("Enter 1 to get Passenger Details");
        System.out.println("Enter 2 to update No Of Booking Counters By Id");
        System.out.println("Enter 3 to update No Of CheckIn Counters By Id");
        System.out.println("Enter 4 to delete delete Terminal By Id");
        System.out.println("Enter 5 to delete Terminal By No Of Booking Counters");
        System.out.println("Enter the choice to proceed");
		
		int choice=sc.nextInt();
		
	 switch(choice){
		  case 1 : air.getPassengerDetails();
	                break;
		  case 2 : System.out.println("Enter the existing id ");
					 int existingId=sc.nextInt();
					// sc.nextLine();
					 System.out.println("Enter the NoOfBookingCounters to be updated");
					 int updatedNoOfBookingCounters=sc.nextInt();
					 air.updateNoOfBookingCountersById(existingId,updatedNoOfBookingCounters);	
					break;
		  case 3 : System.out.println("Enter the existing id ");
					 int existingId1=sc.nextInt();
					 System.out.println("Enter the NoOfCheckInCounters to be updated");
					 int updatedNoOfCheckInCounters=sc.nextInt();
					 air.updateNoOfCheckInCountersById(existingId1,updatedNoOfCheckInCounters); 
					  break;
		  case 4 : System.out.println("Enter the id to be deleted");
					 int availableId=sc.nextInt();
					 air.deleteTerminalById(availableId);		  
		              break;
		  case 5 : System.out.println("Enter the noOfBookingCounters to be deleted");
					 int availableNoOfBookingCounters=sc.nextInt();
					 air.deleteTerminalByNoOfBookingCounters(availableNoOfBookingCounters);
	  }
	  	 System.out.println("Do you want to continue further Yes/No");
        option =sc.next();
	  }
  
	while(option.equalsIgnoreCase("Yes"));
	 }
 }
