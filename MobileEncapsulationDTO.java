public class MobileEncapsulationDTO{

///to achieve encapsulation
  private String name;
  private double price;
  private  String os;
  private int memoryStorage;
  private double screenSize;

 ///getter and setter
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
 
 public String getOs(){
  return os;
 }
 
 public void setOs(String os){
  this.os=os;
 }
 
 public int getMemoryStorage(){
  return memoryStorage;
 }
 
 public void setMemoryStorage(int memoryStorage){
  this.memoryStorage=memoryStorage;
 }
 
 public double getScreenSize(){
   return screenSize;
 }
  
 public void setScreenSize(double screenSize){
   this.screenSize=screenSize;
 }

/* public void toCommunicate(){
   System.out.println("mobile is usefull to communicate with people");
 } */

}