class TerminalDto{

  private int id;
  private int noOfBookingCounters;
  private int noOfShops;
  private int noOfCheckInCounters;
  private int noOfBaggageCounters; 
  
   public TerminalDto(){
	  System.out.println("TerminalDto object created");
  }
  
  public int getId(){
	return id;  
  }
  
  public void setId(int id){
	this.id=id;  
  }
 
  
  public int getNoOfBookingCounters(){
	return noOfBookingCounters;  
  }
  
  public void setNoOfBookingCounters(int noOfBookingCounters){
	this.noOfBookingCounters=noOfBookingCounters;  
  }

  public int getNoOfShops(){
	return noOfShops;  
  }
  
  public void setNoOfShops(int noOfShops){
	this.noOfShops=noOfShops;  
  }

  public int getNoOfCheckInCounters(){
	return id;  
  }
  
  public void setNoOfCheckInCounters(int noOfCheckInCounters){
	this.noOfCheckInCounters=noOfCheckInCounters;  
  }

  public int getNoOfBaggageCounters(){
	return noOfBaggageCounters;  
  }
  
  public void setNoOfBaggageCounters(int noOfBaggageCounters){
	this.noOfBaggageCounters=noOfBaggageCounters;  
  }
  
}