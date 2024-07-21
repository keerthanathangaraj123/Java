import java.util.*;
class Bar{
static String wineNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
static int wineBrandIndex;
public static boolean addWineBrands(String wineBrand){
boolean isWineCreated = false;
if(wineBrandIndex<wineNames.length){
   if(wineBrand !=null){
   wineNames[index]=wineBrand;
   index++;
   isWineCreated = true;
   
   }else{
   System.out.println("WineBrand not found");
   }
  }                                                                                                                                                                                                                                                                                                                                                                        
   
   return isWineCreated;
   }
   
   public static void getAllBrands(){
   for(String wineBrand:wineNames){
   System.out.println(wineBrand);
   }
   }
           
   public static boolean updateWineBrands(String oldWineBrands , String newWineBrands)
   {
   boolean isUpdatedBrandsCreated = false;
 for(index = 0;index< wineNames.length;index++){
if(oldWineBrands ==  wineNames[index]){
wineNames[index]=newWineBrands;
}
isUpdatedBrandsCreated = true;
}
return isUpdatedBrandsCreated;
}

public static boolean deletedWineBrand(String WineBrandToBeDeleted){
	boolean isWineBrandToBeDeleted= false;
	int oldIndex , newIndex;
	for(newIndex = 0,oldIndex = 0;oldIndex<wineNames.length;oldIndex++){
		if(wineNames[oldIndex] !=WineBrandToBeDeleted){
		wineNames[newIndex]=wineNames[oldIndex];
		newIndex++;
		}
	}
        wineNames	= Arrays.copyOf(wineNames , newIndex);
	if(wineNames!=null){
		isWineBrandToBeDeleted = true;
	}
	if(isWineBrandToBeDeleted == false){
		System.out.println("wine name not found");
	}
return isWineBrandToBeDeleted;
}
}
	  

 