class TvChannelsTester{

    public static void main(String[] args){
	  TvChannels tv = new TvChannels();
	  tv.setId(001);
	  tv.setName("MTV");
	  tv.setType("Entertainment");
	  tv.setFavShow("coke studio,MTV unplugged");
	  tv.setBroadCastType("television broadcasting");
	  tv.forEntertainment();
	  
	  System.out.println(tv.getId() + " " + tv.getName() + " " + tv.getType() + " " +  tv.getFavShow() +" " +  tv.getBroadCastType());
	  
  }


}