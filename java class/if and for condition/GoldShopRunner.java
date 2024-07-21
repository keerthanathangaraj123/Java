class GoldShopRunner{
public static void main(String goldItem[]){
      boolean isGoldNames = GoldShop.addGoldItem("Necklace");
      System.out.println("The Actors names are " +isGoldNames);

      isGoldNames = GoldShop.addGoldItem(" Ring");
      System.out.println("The Actors names are " +isGoldNames);

      isGoldNames = GoldShop.addGoldItem("Bracelet");
      System.out.println("The Actors names are " +isGoldNames);

      isGoldNames = GoldShop.addGoldItem("Earrings");
      System.out.println("The Actors names are " +isGoldNames);

isGoldNames = GoldShop.addGoldItem("Chain");
      System.out.println("The Actors names are " +isGoldNames);
  
  isGoldNames = GoldShop.addGoldItem("Pendant");
      System.out.println("The Actors names are " +isGoldNames);
 
 

isGoldNames = GoldShop.addGoldItem("Brooch");
      System.out.println("The Actors names are " +isGoldNames);
	  
	  GoldShop.getAllGoldItems();
	  boolean isUpdatedNames=GoldShop.updateGoldItem("Brooch","Bar");
	  System.out.println("the updated Actors are "+isUpdatedNames);
	  GoldShop.getAllGoldItems();
	  
	  boolean isDeletedName=GoldShop.deletedItem("Pendant");
System.out.println("The deleted Item "+isDeletedName);
	 GoldShop.getAllGoldItems(); 
	  
	  }







}