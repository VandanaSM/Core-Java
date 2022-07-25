package com.xworkz.airport;

import java.util.Scanner;

import com.xworkz.airport.crud.Airport;
import com.xworkz.airport.crud.impl.AirportImpl;
import com.xworkz.airport.dto.TerminalDTO;

public class AirportTester {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		Airport air=new AirportImpl(size);
		
		for(int i=0;i<size;i++) {
		
		TerminalDTO dto=new TerminalDTO();
		
		System.out.println("Enter the id of terminal");
		int id=sc.nextInt();
		
		System.out.println("Enter the no Of Booking Counters");
		int noOfBookingCounters=sc.nextInt();
		
		System.out.println("Enter the no Of Shops");
	    int noOfShops=sc.nextInt();
	    
	    System.out.println("Enter the no Of CheckIn Counters");
	    int noOfCheckInCounters=sc.nextInt();
	    
	    System.out.println("Enter the no Of Baggage Counters");
	    int noOfBaggageCounters=sc.nextInt();
	    
	    dto.setId(id);
	    dto.setNoOfBaggageCounters(noOfBaggageCounters);
	    dto.setNoOfBookingCounters(noOfBookingCounters);
	    dto.setNoOfCheckInCounters(noOfCheckInCounters);
	    dto.setNoOfShops(noOfShops);
	    
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
		  case 1 : air.getTerminalDetails();
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
       sc.close();
	  }
 
	while(option.equalsIgnoreCase("Yes"));
	 }
}
