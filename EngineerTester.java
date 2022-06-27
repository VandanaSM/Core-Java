class EngineerTester{

 public static void main(String[] args){
   Engineer engg=new Engineer();
     engg.duration="4 years";
     engg.collegeName="Poojya dodappa appa clg of engg";
     engg.address="Gulbarga";
    
	 
	 engg.problemSolving();
   System.out.println("Engineering is of " + engg.duration);
   System.out.println("I have completed my engg in " + engg.collegeName + " " + " at " + engg.address );
  
   EcEngineer ec=new EcEngineer();
   ec.solvingInfrastructureProblems();
   
   CivilEngg civil=new CivilEngg();
   civil.solvingInfrastructureProblems();
   
   EeeEngineer eee=new EeeEngineer();
   eee.solvingElectricalProblems();
   
   CsEngg cs=new CsEngg();
   cs.solvingTechnologyProblems();
   
   MechEngg mech=new MechEngg();
   mech.solvingMechanicalProblems();
   
   AeronauticalEngg aero=new AeronauticalEngg();
   aero.solvingAeronauticalProblems();
   
   IndustrialProductionEngg ip=new IndustrialProductionEngg();
   ip.solvingIndusProdProblems();
   
   
 
 
 
 
 
 }





}