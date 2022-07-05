class MusicPlayerTester{

    public static void main(String[] args){
	  MusicPlayer mp=new MusicPlayer();
	  mp.setId(001);
	  mp.setName("Gaana");
	  mp.setType("online");
	  mp.setLanguage("English,hindi,kannada,telugu,etc");
	  mp.toGetPeace();
	  
	  System.out.println(mp.getId() + " " + mp.getName() + " " + mp.getType() + " " +  mp.getLanguage());
	  
  }


}