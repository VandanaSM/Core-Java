class InstitutesTester{

  public static void main(String[] args){
     Xworkz xworkz =new Xworkz();
	 xworkz.typeOfCoaching="Java full stack devlopment course";
     xworkz.location="Bangalore";
     xworkz.durationInMonths=6;
	 xworkz.fee= 25000.00;
	 
	 xworkz.toLearnSkills();
	 
	 System.out.println(xworkz.typeOfCoaching +"  " + xworkz.location + "  " + xworkz.durationInMonths + "  " + xworkz.fee );
	 
	 
  }

}