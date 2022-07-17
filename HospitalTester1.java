class HospitalTester1{

   public static void main(String[] args){
     PatientDTO dto=new PatientDTO();   /// 1st object is parent type and PatientDTO is child type
	 dto.setId(1);                        ///passing value of id by using set()
	 dto.setName("sri");
	 dto.setAddress("Rajajinagar");
	 System.out.println(dto);
	 
	 dto.hashCode();           ///hashcode work on hashing technique which give unique no to every onject           
	 System.out.println( dto.hashCode());

	 PatientDTO dto1=new PatientDTO(); 
      dto1.setId(2);	 
      dto1.setName("sushi");
	 dto1.setAddress("Rajajinagar");
	 System.out.println(dto1);	 
	 dto1.hashCode(); 
	 System.out.println("the unique code for PatientDTO is " + dto1.hashCode());
	 
	 PatientDTO dto2=dto;   
	 dto2.hashCode();
	 dto2.setId(3); 
	 System.out.println(dto.equals(dto2));   //this equals in object cls compares two objects/ address of object
	 
	 String hero=  "Darshan";
	 String hero1= "darshan";
	 System.out.println(hero.equals(hero1));    ///this equals in String cls compares 
	 
	 System.out.println(dto2);
	 System.out.println(dto.toString());
	 
	 System.out.println(dto);
   }

}


///equals uses internally uses hashcode() to compare 
//hashcode can also be used to compare and is faster than equals
///new generates new hashcode at diff location

///String and wrapper cls are spl cls which can be created without new keyword


///if printing ref var then jvm directly calls toString() (comes from object cls) internally which prints ClassName with hexadecimal value
//which is not human understandable form so when we need it to print the states/var of the object so we need to 
///override toString() in dto cls by returning the values of var set by set() without using get()
  