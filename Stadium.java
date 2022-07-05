class Stadium{

  private int id;
  private String name;
  private String type;
  private String address;
  private int capacity;
  
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
  
  public String getType(){
   return type;
  }
  
  public void setType(String type){
   this.type=type;
  }
  
  public String getAddress(){
   return address;
  }
  
  public void setAddress(String address){
   this.address=address;
  }
  
  public int getCapacity(){
   return capacity;
  }
  
  public void setCapacity(int capacity){
   this.capacity=capacity;
  }
  
  public static void toViewEvent(){
    System.out.println("Stadium is place for where sports,concerts or other events can be view by the speactators");
  }



}