import java.util.*;
class RedChillesEntertainment{
static String movieActors[]={null,null,null,null,null,null,null,null,null};
static int Index;
public static boolean addmovieActors(String movieActorsName){
boolean isMovieActorsCreated = false;

if( movieActorsName!=null){
movieActors[Index] = movieActorsName;
Index++;
}
else{
System.out.println("The movie actors are not found");
}
isMovieActorsCreated = true;

return isMovieActorsCreated;
}

public static void getMovieActorsName()
{
for( String movieActorsName:movieActors)
System.out.println(movieActorsName);
}

public static boolean UpdatedActorsName(String oldActorName, String NewActorName){
boolean isUpdatedActorName = false;
for(int index = 0;index<movieActors.length;index++)

{
if(oldActorName == movieActors[index]){
movieActors[index]= NewActorName;
}
isUpdatedActorName = true;
}

if(isUpdatedActorName == false){
System.out.println("The Updated Actor Name not found");
}
return isUpdatedActorName;
}
public static boolean deletedActorName(String actorToBeDeleted){
	boolean isActorToBeDeleted= false;
	int oldIndex , newIndex;
	for(newIndex = 0,oldIndex = 0;oldIndex<movieActors.length;oldIndex++){
		if(movieActors[oldIndex] !=actorToBeDeleted){
		movieActors[newIndex]=movieActors[oldIndex];
		newIndex++;
		}
	}
movieActors = Arrays.copyOf(movieActors , newIndex);
	if(movieActors!=null){
		isActorToBeDeleted = true;
	}
	if(isActorToBeDeleted== false){
		System.out.println("ActorToBeDeleted not found");
	}
return isActorToBeDeleted;
} 
}