class VolumeOfCube{

   int side;
   int vol;
   
   public VolumeOfCube(){
     //this(int side);
	 System.out.println("object VolumeOfCube is created");
	 
   } 

   public VolumeOfCube(int side){
     this();
	 this.side=side;
	 vol=side*side*side;
     System.out.println("the side of the cube is " +side);
   }  

   public static void main(String[] args){
    
	  VolumeOfCube vol=new VolumeOfCube(10);
	    System.out.println("volume of the cube is " +vol.vol);
   
   
   }   






}