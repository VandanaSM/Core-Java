//RULE 1.make encapsulated class as public
public class ApartmentDTO{
  ///DTO-when want only data in cls -from design pattern view THIS IS DTO CLASS
                                  ///FROM JAVA POINT OF VIEW THIS IS ENCAPSULATED CLASS
  
 ///RULE 2.make data-var methods as private
  private int id;
  private int price;
  private String name;
  private String owner;

  /*we write getter by prefix setId
  public returntype getVarName(){
   return varName;
  }   */  
  
  ////RULE 3.write public getter and setter for each data
  public int getId(){
    return id;
  } 
  
  
  /*we write setter by prefix setId
     public void setVarName(datatype varName){
	   this.varName=varName;
	 }   */
  public void setId(int id){
    this.id=id;
  }
  
  public int getPrice(){
	  return price;
  }
  
  public void setPrice(int price){
	  this.price=price;
  }
  
  public String getName(){
	  return name;
  }
  
  public void setName(String name){
	  this.name=name;
  }
  
  public String getOwner(){
	  return owner;
  }
  
  public void setOwner(String owner){
	  this.owner=owner;
  }
}