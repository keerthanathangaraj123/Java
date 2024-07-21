class AmusementPark{

   String name;
   String place;
   String noOfGames;;

   public void play(){
   System.out.println("AmusementPark is used to play games");
   }
   
   
   public boolean createDetails(String name,String place,String noOfGames){
	   boolean isGamesStarted = false;
	   if(name!=null && place!=null && noOfGames!=null){
	   this.name=name;
       this.place=place;
       this.noOfGames=noOfGames;
   isGamesStarted= true;
	   }
	   
	   return isGamesStarted;
   }
   
   public void getDetails(){
		System.out.println("The AmusementPark  Gamename :"+this.name);
		System.out.println("The AmusementPark place :"+this.place);
		System.out.println("The AmusementPark noOfGames:"+this.noOfGames);
   }
}