class Newspaper{

 private int id;
 private String name;
 private String type;
 private String language;
 
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
 
  public String getLanguage(){
	 return language;
 }
 
 public void setLanguage(String language){
	 this.language=language;
 }
 
  public String getType(){
	 return type;
 }
 
 public void setType(String type){
	 this.type=type;
 }
 
 public static void toShareNews(){
	 System.out.println("Newspaper is media through which information of day to day events happening around the world");
 }
  
  


}