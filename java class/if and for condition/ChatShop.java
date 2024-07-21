import java.util.*;
class ChatShop{
static String name="shri";
static String ownerName ="keerthana";
static String chatShop[]={null ,null,null,null,null,null};
static double price[]={0.0,0.0,0.0,0.0,0.0,0.0};
static int chatShopIndex;
static int chatShopPriceIndex;

       public static boolean createChatShop(String chatName){
       System.out.println("createChatShop is started");
       boolean ischatShopCreated = false;
       if(chatName!=null){
       chatShop[chatShopIndex] = chatName;
       chatShopIndex++;
       ischatShopCreated =true;
       }else System.out.println("chatName not found");

return ischatShopCreated;
}

         public static void getShopName()
         {
         System.out.println("getShopName created");
         for(String chatName :chatShop)
         System.out.println(chatName);
         }
		  
		  
	   public static boolean getChatShopPrice(double chatprice){
       System.out.println("getChatShopPrice is started");
       boolean ischatPrice = false;
       if(chatprice > 0.0){
       price[chatShopPriceIndex] = chatprice;
       chatShopPriceIndex++;
       ischatPrice =true;
       }else System.out.println("chatprice  not found");
	   
	   return ischatPrice;
}
     public static boolean updateChatNames(String oldChatNames , String newChatNames){
	 boolean isUpdateChatNamesCreated = false;
  
  for(int index =0;index<chatShop.length;index++){
	  if(oldChatNames == chatShop[index]){
		  chatShop[index] = newChatNames;
            isUpdateChatNamesCreated = true;
	 }
  }
  if(isUpdateChatNamesCreated == false)
  {
	  System.out.println("oldChatName not found");
  }
return isUpdateChatNamesCreated;
	 }
	 
	  
	 public static boolean deleteChatName(String chatNameToBeDeleted){
		 boolean isDeletedChatNameCreated = false;
		 int newIndex ,oldIndex;
		 for(newIndex = 0 , oldIndex = 0;oldIndex<chatShop.length;oldIndex++){
			 if(chatShop[oldIndex]  != chatNameToBeDeleted){
				 chatShop[newIndex]=chatShop[oldIndex];
				 newIndex++;
			 }
		 }
		 chatShop = Arrays.copyOf(chatShop , newIndex);
		 if(chatShop !=null){
			 isDeletedChatNameCreated = true;
		 }
		 if(isDeletedChatNameCreated == false){
			 System.out.println(isDeletedChatNameCreated +"not found");
		 }
		 return isDeletedChatNameCreated;
	 }
}
