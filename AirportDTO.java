public class AirportDTO{

 private int id;
 private String name;
 private String type;
 private int noOfTerminals;
 private int noOfRunways;
 
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
 
  public int getNoOfTerminals(){
	 return noOfTerminals;
 }
 
 public void setNoOfTerminals(int noOfTerminals){
	 this.noOfTerminals=noOfTerminals;
 }
 
  public int getNoOfRunways(){
	 return noOfRunways;
 }
 
 public void setNoOfRunways(int noOfRunways){
	 this.noOfRunways=noOfRunways;
 }
 
  public String getType(){
	 return type;
 }
 
 public void setType(String type){
	 this.type=type;
 }
 
/* public static void toTravelFaster(){
	 System.out.println("medium of transport is through air ,comparatively faster mode of transport ");
 }*/
  


}