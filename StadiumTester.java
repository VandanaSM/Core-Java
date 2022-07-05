class StadiumTester{

  public static void main(String[] args){
     Stadium std=new Stadium();
	 std.setId(001);
	 std.setName("kanteerava stadium");
	 std.setType("sports");
	 std.setAddress("sampangirama nagar");
	 std.setCapacity(25000);
	 std.toViewEvent();
	 
	 System.out.println("the stadium id is " + std.getId() + " name is " + std.getName() + " type is " + std.getType() + 
	                       " present at " + std.getAddress()  + " and can hold upto " + std.getCapacity());
	 
  
  }

}