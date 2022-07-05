class Weapons{

 private int id;
 private String name;
 private String type;
 private int price;
 
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
 
  public int getPrice(){
	 return price;
 }
 
 public void setPrice(int price){
	 this.price=price;
 }
 
  public String getType(){
	 return type;
 }
 
 public void setType(String type){
	 this.type=type;
 }

 
 public static void toHurtOthers(){
	 System.out.println("Weapons are mostly used to hurt others or for self defence purpose");
 }
  
  


}