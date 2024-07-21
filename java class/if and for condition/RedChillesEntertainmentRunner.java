class RedChillesEntertainmentRunner{
public static void main(String entertainment[]){
      boolean isNames = RedChillesEntertainment.addmovieActors("vijay");
      System.out.println("The Actors names are " +isNames);

      isNames = RedChillesEntertainment.addmovieActors("Samantha");
      System.out.println("The Actors names are " +isNames);

      isNames = RedChillesEntertainment.addmovieActors("ajith");
      System.out.println("The Actors names are " +isNames);

      isNames = RedChillesEntertainment.addmovieActors("Wikki");
      System.out.println("The Actors names are " +isNames);

       isNames = RedChillesEntertainment.addmovieActors("Ravi");
      System.out.println("The Actors names are " +isNames);
  
  isNames = RedChillesEntertainment.addmovieActors("Yash");
      System.out.println("The Actors names are " +isNames);
 
 isNames = RedChillesEntertainment.addmovieActors("upendra");
      System.out.println("The Actors names are " +isNames);

isNames = RedChillesEntertainment.addmovieActors("sudeep");
      System.out.println("The Actors names are " +isNames);
	  
	  isNames = RedChillesEntertainment.addmovieActors("keerthana");
      System.out.println("The Actors names are " +isNames);
	  
	  
	   RedChillesEntertainment.getMovieActorsName();
	  boolean isUpdatedNames= RedChillesEntertainment.UpdatedActorsName("sudeep","darshan");
	  System.out.println("the updated Actors are "+isUpdatedNames);
	  RedChillesEntertainment.getMovieActorsName();
	  
	  
	  boolean isActor = RedChillesEntertainment.deletedActorName("upendra");
	  System.out.println("the deleted Actors are "+isActor);
	  RedChillesEntertainment.getMovieActorsName();
}







}