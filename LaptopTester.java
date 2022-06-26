class LaptopTester{

  public static void main(String[] args){
   Dell del=new Dell();
   del.ram=8;
   del.processor="core i5";
   del.storage="1 TB";
   del.price=45000;
    
	del.toPracticeJava();
	
   System.out.println(del.ram + " " + del.processor + " " + del.storage + " " + del.price);
  
  }


}