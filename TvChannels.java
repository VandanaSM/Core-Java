class TvChannels{

 private int id;
 private String name;
 private String type;
 private String favShow;
 private String broadCastType;

 
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
 
  public String getFavShow(){
	 return favShow;
 }
 
 public void setFavShow(String favShow){
	 this.favShow=favShow;
 }
 
  public String getType(){
	 return type;
 }
 
 public void setType(String type){
	 this.type=type;
 }
 
   public String getBroadCastType(){
	 return broadCastType;
 }
 
 public void setBroadCastType(String broadCastType){
	 this.broadCastType=broadCastType;
 }
 
 public static void forEntertainment(){
	 System.out.println("tv main use is for entertainment purpose");
 }
  
  


}