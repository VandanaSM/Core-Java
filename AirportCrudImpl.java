import java.util.Arrays;

//implementation cls-implements abstract methods
class AirportCrudImpl implements AirportCrud{

  TerminalDto dtos[];
  int index;
  
  public AirportCrudImpl(int size){
     dtos=new TerminalDto[size];	
	System.out.println("AirportCrud object created");
  }
  
  @Override
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
	 
	 @Override
  public void getPassengerDetails(){
	  System.out.println("Start of getPassengerDetails()");
	  for(int i=0;i<dtos.length;i++){
		  System.out.println(dtos[i].getId() + " " + dtos[i].getNoOfBookingCounters() + " "  
		              + " " + dtos[i].getNoOfShops() + " " + dtos[i].getNoOfCheckInCounters()+ " " + dtos[i].getNoOfBaggageCounters()) ; 
	  }
  }
     
	 @Override
     public boolean updateNoOfBookingCountersById(int id,int noOfBookingCounter){    
	  System.out.println("start of updateNoOfBookingCountersById()");
	  boolean updatedNoOfBookingCounter=false;
	  for(int i=0;i<dtos.length;i++){      
		  if(dtos[i].getId()==id){        
			  updatedNoOfBookingCounter=true;
			  dtos[i].setNoOfBookingCounters(noOfBookingCounter);    
			  System.out.println("noOfBookingCounter updated successfully");
		  }
		  else{
			  System.out.println("Couldnot update noOfBookingCounter,please provide proper id");
		  }
	  }
	  return updatedNoOfBookingCounter;
  }
  
  @Override
   public boolean updateNoOfCheckInCountersById(int id,int noOfCheckInCounters){
	  System.out.println("start of updateBookPublisherByName()");
	  boolean updatedNoOfCheckInCounters=false;
	  for(int i=0;i<dtos.length;i++){
		  if(dtos[i].getId()==(id)){
			  updatedNoOfCheckInCounters=true;
			  dtos[i].setNoOfCheckInCounters(noOfCheckInCounters);
			  System.out.println("NoOfCheckInCounters is updated successfully");
		  }
		  else{
			  System.out.println("Couldnot update NoOfCheckInCounters , please enter proper id");
		  }
	  }
	  return updatedNoOfCheckInCounters;
  } 
  
  @Override
     public boolean deleteTerminalById(int id){
	  System.out.println("start of deleteterminalById()");
	  boolean deletedId=false;
	  int i,j;
	  for(i=0,j=0;j<dtos.length;j++){
		  if(dtos[j].getId()!=id){
			  dtos[i++]=dtos[j];
			  deletedId=true;
		  }
		  else{
			  System.out.println("terminal id not found");
		  }
	  }
	  dtos=Arrays.copyOf(dtos,i);
	  return deletedId;
    }
  
  @Override
   public boolean deleteTerminalByNoOfBookingCounters(int noOfBookingCounters){
	  System.out.println("inside deleteTerminalByNoOfBookingCounters()");
	  boolean terminalDeleted=false;
	  int i,j;
	  for(i=0,j=0;j<dtos.length;j++){
		  if(dtos[j].getNoOfBookingCounters()!=noOfBookingCounters){
			  dtos[i++]=dtos[j];
			  terminalDeleted=true;
		  }
		  else{
			  System.out.println("Terminal orderNo not found");
		  }
	  }
	  dtos=Arrays.copyOf(dtos,i);
	  return terminalDeleted;
  }
  
}