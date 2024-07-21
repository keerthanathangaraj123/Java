class ChatShopRunner {
    public static void main(String chatItems[]) {
        boolean isAdded = ChatShop.createChatShop("masala puri");
        System.out.println("The item was added: " + isAdded);
       
        isAdded = ChatShop.createChatShop("gobi");
        System.out.println("The item was added: " + isAdded);
        
        isAdded = ChatShop.createChatShop("chips");
        System.out.println("The item was added: " + isAdded);
        

        isAdded = ChatShop.createChatShop("mushroom");
        System.out.println("The item was added: " + isAdded);
        
        isAdded = ChatShop.createChatShop("baby corn");
        System.out.println("The item was added: " + isAdded);
        
        isAdded = ChatShop.createChatShop("pani puri");
        System.out.println("The item was added: " + isAdded);
        
boolean updateditems = ChatShop.updateChatNames("pani puri","samosa masala");
        System.out.println("The updated value is"+updateditems); 
        ChatShop.getShopName();
		boolean deleteItems = ChatShop.deleteChatName("mushroom");
		System.out.println("The deleted value is"+deleteItems); 
        ChatShop.getShopName();
		 deleteItems = ChatShop.deleteChatName("chips");
		System.out.println("The deleted value is"+deleteItems); 
        ChatShop.getShopName();
		
    }
}