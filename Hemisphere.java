class Hemisphere{

  int r;
  double pie;
  double area;
 public Hemisphere(){
 
  System.out.println("object Hemisphere is created");
 
 }
 
 public Hemisphere(int r){
  this();
  this.r=r;
  this.pie=pie;
  this.area=area;
 }
 
 public static void main(String[] args){
  Hemisphere hem=new Hemisphere(10);
  hem.pie=3.1428517;
  hem.area=3*hem.pie*hem.r*hem.r;
  System.out.println("the area of the hemisphere is " +hem.area);
 
 }




}