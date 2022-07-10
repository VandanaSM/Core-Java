class OrderDTO{

  private int id;
  private String name;
  private String address;
  private long contactNo;
  private String orderNO;
  private double billAmount;
  
  ///constructor
  public OrderDTO(){
    System.out.println("PatientDTO object is created");
  }
  
  public int getId(){
   return id;
  }
  
  public void setId(int id){
    this.id=id;
  }
  
  public String getName(){
   return name;
  }
  
  public void setName(String name){
    this.name=name;
  }
  
  public String getAddress(){
   return address;
  }
  
  public void setAddress(String address){
    this.address=address;
  }
  
  public long getContactNo(){
   return contactNo;
  }
  
  public void setContactNo(long contactNo){
    this.contactNo=contactNo;
  }
  
  public String getOrderNo(){
	  return orderNO;
  }

  public void setOrderNo(String orderNO){
	  this.orderNO=orderNO;
  }

  public double getBillAmount(){
	  return billAmount;
  }
  
  public void setBillAmount(double billAmount){
	  this.billAmount=billAmount;
  }
}