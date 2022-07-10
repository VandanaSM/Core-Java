class CustomerCrud{

  OrderDTO dtos[];
  int index;
  
  public CustomerCrud(int size){
	  dtos=new OrderDTO[size];
	  System.out.println("CustomerCrud object created");
  }
  
  public boolean createCustomerDetails(OrderDTO dto){
	  System.out.println("start of createCustomerDetails()");
	    boolean isAdded=false;
		if(dto!=null && dto.getName()!=null){
			this.dtos[index++]=dto;
			isAdded=true;
			System.out.println("Customer details added successfully");
		}
		else{
			System.out.println("Please enter customer details");
		}
	return isAdded;
  }
  
  public void getCustomerDetails(){
	  System.out.println("start of getCustomerDetails()");
	  for(int i=0;i<dtos.length;i++){
	  System.out.println(dtos[i].getId() + " " + dtos[i].getName() + " " + dtos[i].getAddress() + " " + dtos[i].getContactNo() +
	                     " " + dtos[i].getOrderNo() + " " + dtos[i].getBillAmount());
      }
  }



}