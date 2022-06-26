class BankTester{

  public static void main(String[] args){
   Sbi sbi=new Sbi();
   sbi.location="Bangalore";
  sbi.noOfBranches=50;
  sbi.atmsAvailable=true;
  sbi.chargesForService=25;
  
  sbi.financialInstitution();
  
  System.out.println(sbi.noOfBranches + " " + sbi.atmsAvailable + " " +sbi.chargesForService);
  
  }

}