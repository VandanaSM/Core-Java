class Games{

 private int id;
 private String name;
 private String type;
 private int noOfPlayers;
 private String equipmentsNeeded;
 
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
 
  public int getNoOfPlayers(){
	 return noOfPlayers;
 }
 
 public void setNoOfPlayers(int noOfPlayers){
	 this.noOfPlayers=noOfPlayers;
 }
 
  public String getEquipmentsNeeded(){
	 return equipmentsNeeded;
 }
 
 public void setEquipmentsNeeded(String equipmentsNeeded){
	 this.equipmentsNeeded=equipmentsNeeded;
 }

 
 public static void toRelaxAndExercise(){
	 System.out.println("Playing games helps to relax and part of exercising");
 }
  
  


}