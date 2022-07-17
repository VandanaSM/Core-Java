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
	  System.out.println(dtos[i]);
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
  
  
   public boolean deleteCustomerByName(String name){
	  System.out.println("inside deleteCustomerByOrderNo()");
	  boolean customerDeleted=false;
	  int i,j;
	  for(i=0,j=0;j<dtos.length;j++){
		  if(!dtos[j].getName().equals(name)){
			  dtos[i++]=dtos[j];
			  customerDeleted=true;
		  }
		  else{
			  System.out.println("Customer not found");
		  }
	  }
	  dtos=Arrays.copyOf(dtos,i);
	  return customerDeleted;
  }

  public String getOrderNameById(int id){
	  System.out.println("Start of getOrderNameById()");
	  String orderName=null;
	  for(int i=0;i<dtos.length;i++){
		  if(dtos[i].getId()==id){
			 orderName= dtos[i].getName();
			 System.out.println(orderName);
		  }
		  else{
			  System.out.println("couldnot get names of customers ,please enter proper id");
		  }
	  }
	  return orderName;
  }

  public String getOrderTypeByName(String name){
	  System.out.println("Start of getOrderNameByName()");
	  String orderType=null;
	  for(int i=0;i<dtos.length;i++){
		  if(dtos[i].getName().equals(name)){
			 orderType= dtos[i].getType();
			 System.out.println(orderType);
		  }
		  else{
			  System.out.println("couldnot get names of customers ,please enter proper id");
		  }
	  }
	  return orderType;  
  }
  
  public int[] getAllQuantities(){
	  System.out.println("Start of getAllQuantities()");
	  int i,j;
	  for(i=0,j=0;i<dtos.length;i++){
		System.out.println(dtos[i].getQuantity());
		     j++;
	  }
	  	  int[] allQuantities=new int[j];
	  for(int y=0,z=0;y<dtos.length;y++){
		  allQuantities[z++]=dtos[y].getQuantity();
		//  System.out.println(allQuantities[z]);

	  }

	  return allQuantities; 
  }
  
    public String[] getAllOrderName(){
	  System.out.println("Start of getAllOrderName()");
	  int i,j;
	  for(i=0,j=0;i<dtos.length;i++){
		System.out.println(dtos[i].getQuantities());
		     j++;
	  }
	  	  String[] getOrderNames=new String[j];
	  for(int y=0,z=0;y<dtos.length;y++){
		  getOrderNames[z++]=dtos[y].getName();
		  //System.out.println(dtos[z].getName());

	  }

	  return getOrderNames; 
  }

  
}