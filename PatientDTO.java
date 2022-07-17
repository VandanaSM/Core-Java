class PatientDTO{

  private int id;
  private String name;
  private String address;
  private Gender gender;   ///Gender is enum nonprimitive datatype with var gender create another cls to store const values
  private Long contactNo;
  
  ///constructor
  public PatientDTO(){
    System.out.println("PatientDTO object is created");
  }
  
  @Override
  public int hashCode(){     ///using hashCode() return unique no by jvm but not human understandable form so using id 
                           ///which developer enters we are passing /returning to it so that it can be understood easily
	  return this.id;
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
  
  public Gender getGender(){
    return gender;
  }

  public void setGender(Gender gender){
    this.gender=gender;
  }
  
  public Long getContactNo(){
   return contactNo;
  }
  
  public void setContactNo(Long contactNo){
    this.contactNo=contactNo;
  }

  @Override         ///overridden to override the toString which is called at object creation i.e ref with the states/var
  public String toString(){
	  return "(PatientDTO : Id="+this.id+",Name="+this.name+",Address="+this.address+",ContactNo="+this.contactNo+",Gender="+this.gender+")";
  }
}