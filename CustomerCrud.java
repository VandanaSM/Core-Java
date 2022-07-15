import java.util.Arrays;

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

  public boolean updateCustomerAddressById(int id,String address){    
	  System.out.println("start of updateCustomerAddressById()");
	  boolean updatedAddress=false;
	  for(int i=0;i<dtos.length;i++){    
		  if(dtos[i].getId()==id){        
			  updatedAddress=true;
			  dtos[i].setAddress(address);     
			  System.out.println("Customer Address updated successfully");
		  }
		  else{
			  System.out.println("Couldnot update Customer address,please provide proper id");
		  }
	  }
	  return updatedAddress;
  }
  
   public boolean updateCustomerContactNoByName(String name,long contactNo){
	  System.out.println("start of updateCustomerContactNoByName()");
	  boolean updatedContactNo=false;
	  for(int i=0;i<dtos.length;i++){
		  if(dtos[i].getName().equals(name)){
			  updatedContactNo=true;
			  dtos[i].setContactNo(contactNo);
			  System.out.println("Customer contact no is updated successfully");
			 
		  }
		  else{
			  System.out.println("Couldnot update Customer contact no , please enter proper Customer name");
		  }
	  }
	  return updatedContactNo;
  } 
   
   public boolean deleteCustomerById(int id){
	  System.out.println("start of deleteCustomerById()");
	  boolean deletedId=false;
	  int i,j;
	  for(i=0,j=0;j<dtos.length;j++){
		  if(dtos[j].getId()!=id){
			  dtos[i++]=dtos[j];
			  deletedId=true;
		  }
		  else{
			  System.out.println("Customer id not found");
		  }
	  }
	  dtos=Arrays.copyOf(dtos,i);
	  return deletedId;
   }
  
  
   public boolean deleteCustomerByOrderNo(String orderNo){
	  System.out.println("inside deleteCustomerByOrderNo()");
	  boolean orderNoDeleted=false;
	  int i,j;
	  for(i=0,j=0;j<dtos.length;j++){
		  if(!dtos[j].getOrderNo().equals(orderNo)){
			  dtos[i++]=dtos[j];
			  orderNoDeleted=true;
		  }
		  else{
			  System.out.println("Customer orderNo not found");
		  }
	  }
	  dtos=Arrays.copyOf(dtos,i);
	  return orderNoDeleted;
  }


}