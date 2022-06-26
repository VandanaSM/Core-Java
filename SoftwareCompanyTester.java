class SoftwareCompanyTester{

  public static void main(String[] args){
   Infosys infosys=new Infosys();
   infosys.noOfBranches=250;
   infosys.noOfEmployees=500000;
   
   infosys.toDevelopSoftwares();
   
   System.out.println(infosys.noOfBranches + "  " + infosys.noOfEmployees);
	
  }


}