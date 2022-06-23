class VolumeOfCylinder{

  int h,r;
  double pie;
  double vol;
  public VolumeOfCylinder(){
    System.out.println("Object VolumeOfCylinder is created");
  }
  
  public VolumeOfCylinder(int h,int r){
    this();
	this.h=h;
	this.r=r;
	this.pie=pie;
	pie=3.1428517;
  }
  
  public static void main(String[] args){
     VolumeOfCylinder vol=new VolumeOfCylinder(10,2);
	 vol.vol=vol.pie*(vol.r)*(vol.r)*(vol.h);
     System.out.println("the volume of the cylinder is " +vol.vol);
  }



}