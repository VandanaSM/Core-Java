class Oximeter{

  private int id;
  private String name;
  private String use;
  private int price;
  private int normalReading;

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
  
  public String getUse(){
	  return use;
  }
  
  public void setUse(String use){
	  this.use=use;
  }
  
  public int getPrice(){
	  return price;
  }
  
  public void setPrice(int price){
	  this.price=price;
  }
  
  public int getNormalReading(){
	  return normalReading;
  }
  
  public void setNormalReading(int normalReading){
	  this.normalReading=normalReading;
  }

  public void toCheckOxygenLevels(){
	  System.out.println("oximeter is used to check oxygen levels in covid patients mainly");
  }

}