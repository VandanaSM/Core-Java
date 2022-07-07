public class CarryBagDTO{

///to achieve encapsulation
  private String name;   ///these are private properties made to achieve encapsulation
  private double price;
  
///getter and setter -each prop has get and set method so 2 mthods for each prop
  public String getName(){
	  return name;
  }
  
  public void setName(String name){
	  this.name=name;
  }

  public double getPrice(){
	  return price;
  }
  
  public void setPrice(double price){
	  this.price=price;
  }

 /* void holdThings(){
    System.out.println("carrybag is used to hold things");
  }*/

  
  
  

} 