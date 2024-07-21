import java.util.*;
class Liberty{
	static int Index;
static String shoeBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
public static boolean addShoeBrands(String brandName){
       System.out.println("brandName is started");
       boolean isBrandNameCreated = false;
       if(brandName!=null){
       shoeBrands[Index] = brandName;
       Index++;
       isBrandNameCreated =true;
       }else System.out.println("brandName not found");

return isBrandNameCreated;
}

         public static void getBrandName()
         {
         System.out.println("getBrandName created");
         for(String shoe :shoeBrands)
         System.out.println(shoe);
         }
		  
public static boolean updateBrandNames(String oldBrandNames , String newBrandNames){
	 boolean isUpdateBrandNamesCreated = false;
  
  for(int index =0;index<shoeBrands.length;index++){
	  if(oldBrandNames == shoeBrands[index]){
		  shoeBrands[index] = newBrandNames;
            isUpdateBrandNamesCreated = true;
	 }
  }
  if(isUpdateBrandNamesCreated == false)
  {
	  System.out.println("brandNames not found");
  }
return isUpdateBrandNamesCreated;
	 }
	 
	  
	 public static boolean deleteBrandName(String brandNameToBeDeleted){
		 boolean isDeletedBrandName = false;
		 int newIndex ,oldIndex;
		 for(newIndex = 0 , oldIndex = 0;oldIndex<shoeBrands.length;oldIndex++){
			 if(shoeBrands[oldIndex]  != brandNameToBeDeleted){
				 shoeBrands[newIndex]=shoeBrands[oldIndex];
				 newIndex++;
			 }
		 }
		 shoeBrands = Arrays.copyOf(shoeBrands , newIndex);
		 if(shoeBrands !=null){
			 isDeletedBrandName = true;
		 }
		 if(isDeletedBrandName == false){
			 System.out.println(isDeletedBrandName +"not found");
		 }
		 return isDeletedBrandName;
	 }
}
