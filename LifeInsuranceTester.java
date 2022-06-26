class LifeInsuranceTester{

 public static void main(String[] args){
   Lic life = new Lic(); 
   life.type="whole life";
   life.plan="Bima jyoti";
   life.age=27;
   life.anyRiskymedconditions=false;
   life.investedAmount=2500;
   life.policyHolderName="Vandana";
   life.lifeAssuredOrNominee="Vatsala";
   
   life.toKeepFutureSecure();
   
   System.out.println(life.type + " " + life.plan +" " + life.age + " " + life.anyRiskymedconditions + " " + life.investedAmount +
                     " " + life.policyHolderName + " " + life.lifeAssuredOrNominee );

}
}