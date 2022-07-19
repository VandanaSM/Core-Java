class SwitchTester{

 public static void main(String[] args){
   
   ///abstrction -ref is interface type and object is class type
    SwitchInf swi=new TubelightImpl1();
	swi.sOn();
	swi.sOff();
	
	SwitchInf sw=new FanImpl();
	sw.sOn();
	sw.sOff();
 }

}


