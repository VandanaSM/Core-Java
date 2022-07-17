class OrderDTO{

  private int id;
  private String name;
  private String address;
  private long contactNo;
  private String type;
  private double billAmount;
  private int quantity;
  
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
  
  public String getType(){
	  return type;
  }

  public void setType(String type){
	  this.type=type;
  }

  public double getBillAmount(){
	  return billAmount;
  }
  
  public void setBillAmount(double billAmount){
	  this.billAmount=billAmount;
  }
  
  public int getQuantity(){
	  return quantity;
  }

  public void setQuantity(int quantity){
	  this.quantity=quantity;
  }
  
  @Override
  public String toString(){
	  return "(OrderDTO : Id="+this.id+",Address="+this.address+",ContactNo="+this.contactNo+",Type="+this.type+",BillAmount="+this.billAmount+",Quantity="+this.quantity+")";
  }
}
