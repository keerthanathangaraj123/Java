import java.util.*;
class GoldShop{
static String goldItems[]={null,null,null,null,null,null,null};
static int index;
public static boolean addGoldItem(String goldNames){
boolean isaddGoldNames = false;
      if(goldNames!=null){
	  goldItems[index]=goldNames;
	  index++;
	  isaddGoldNames = true;
	  }
	  else{
	  System.out.println("goldItems not found");
	  }
	  
return isaddGoldNames; 
}

public static void getAllGoldItems()
{
for( String goldNames:goldItems)
System.out.println(goldNames);
}
	  
public static boolean updateGoldItem(String oldNames, String newNames){
boolean isUpdateGoldItem = false;
for(index =0;index<goldItems.length;index++){
if(oldNames==goldItems[index]){
goldItems[index] = newNames;
}
isUpdateGoldItem = true;
}
if(isUpdateGoldItem == false){
System.out.println("update item not found");
}
return isUpdateGoldItem;
}

public static boolean deletedItem(String itemToBeDeleted){
	boolean isItemToBeDeleted= false;
	int oldIndex , newIndex;
	for(newIndex = 0,oldIndex = 0;oldIndex<goldItems.length;oldIndex++){
		if(goldItems[oldIndex] !=itemToBeDeleted){
		goldItems[newIndex]=goldItems[oldIndex];
		newIndex++;
		}
	}
	goldItems = Arrays.copyOf(goldItems , newIndex);
	if(goldItems!=null){
		isItemToBeDeleted = true;
	}
	if(isItemToBeDeleted == false){
		System.out.println("Item ToBeDeleted not found");
	}
return isItemToBeDeleted;
}
}
	  
	  
	  
	  
	  