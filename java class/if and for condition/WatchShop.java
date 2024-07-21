import java.util.*;
class WatchShop{
static String watchBrands[]={null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addWatchBrandNames(String watchBrand){
boolean isBrandNamesCreated = false;
    if(watchBrand!=null){
	watchBrands[index]=watchBrand;
	index++;
	isBrandNamesCreated=true;
	}
	else{
	System.out.println("Watch Names not found");
	}
	return isBrandNamesCreated;
	
	}
	
	public static void getAllWatchBrands(){
	for(String watchName:watchBrands){
	System.out.println(watchName);
	
}
}

  public static boolean updateWatchBrands(String oldBrandName ,String newBrandName){
  boolean isUpdateBrandNameCreated = false;
  for(index = 0;index<watchBrands.length;index++){
 if(oldBrandName == watchBrands[index]){
 watchBrands[index] = newBrandName;
 isUpdateBrandNameCreated = true;
 }
 
 }
 if(isUpdateBrandNameCreated == false){
 System.out.println("The Updated Items are not found");
 }
 return isUpdateBrandNameCreated;
 }
 
 public static boolean deletedWatchBrand(String watchBrandToBeDeleted){
	boolean isWatchBrandToBeDeleted= false;
	int oldIndex , newIndex;
	for(newIndex = 0,oldIndex = 0;oldIndex<watchBrands.length;oldIndex++){
		if(watchBrands[oldIndex] !=watchBrandToBeDeleted){
		watchBrands[newIndex]=watchBrands[oldIndex];
		newIndex++;
		}
	}
        watchBrands	= Arrays.copyOf(watchBrands , newIndex);
	if(watchBrands!=null){
		isWatchBrandToBeDeleted = true;
	}
	if(isWatchBrandToBeDeleted == false){
		System.out.println("watch name not found");
	}
return isWatchBrandToBeDeleted;
}
}
	  

 
 
  