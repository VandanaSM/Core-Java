class GamesTester{

    public static void main(String[] args){
	  GamesDTO game = new GamesDTO();
	  game.setId(001);
	  game.setName("Badminton");
	  game.setType("outdoor game");
	  game.setNoOfPlayers(2);
	  game.setEquipmentsNeeded("Racket and Shuttle cocks ");
	  game.toRelaxAndExercise();
	  
	  System.out.println(game.getId() + " " + game.getName() + " " + game.getType() + " " +  game.getNoOfPlayers() + 
	                      "  " + game.getEquipmentsNeeded());
	  
  }


}