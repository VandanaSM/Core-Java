class AirportCrud{

  TerminalDto dtos[];
  int index;
  
  public AirportCrud(int size){
     dtos=new TerminalDto[size];	
	System.out.println("AirportCrud object created");
  }
  
  public boolean createTerminalDetails(TerminalDto dto){
    System.out.println("Start of createPassengerDetails()");
	 boolean isAdded=false;
	 if(dto!=null && dto.getNoOfBookingCounters()!= 0){
		 this.dtos[index++]=dto;
		 isAdded=true;
		 System.out.println("Passenger details created succesfully");
	 }else{
		 System.out.println("Enter the passenger details first");
	 }
	 return isAdded;
  }
	 
  public void getPassengerDetails(){
	  System.out.println("Start of getPassengerDetails()");
	  for(int i=0;i<dtos.length;i++){
		  System.out.println(dtos[i].getId() + " " + dtos[i].getNoOfBookingCounters() + " "  
		              + " " + dtos[i].getNoOfShops() + " " + dtos[i].getNoOfCheckInCounters()+ " " + dtos[i].getNoOfBaggageCounters()) ; 
	  }
  }
     
  
}