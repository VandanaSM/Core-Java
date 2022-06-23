class PyramidVolume{

   int baseLength;
   int height;
   int vol;
   
   public PyramidVolume(){
     System.out.println("object PyramidVolume is created ");
   }
   
   public PyramidVolume(int baseLength,int height){
     this();
	 this.baseLength=baseLength;
	 this.height=height;
	 this.vol=vol;
   }
   
   public static void main(String[] args){
     
	 PyramidVolume pyvol=new PyramidVolume(5,12);
	 pyvol.vol=((pyvol.baseLength)*(pyvol.baseLength)*(pyvol.height))/3;
	 System.out.println("volume of the pyramid " +pyvol.vol);
   }



}