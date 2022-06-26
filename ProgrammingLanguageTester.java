class ProgrammingLanguageTester{

 public static void main(String[] args){
  Java java =new Java();
  java.noOfDevlopers="5";
  java.skills="HTML,CSS,Javascipt,Framework,Spring boot,Hibernate";
 
  java.toDevlopApplications();
  
  System.out.println(java.noOfDevlopers + " " + java.skills  );
 }


}