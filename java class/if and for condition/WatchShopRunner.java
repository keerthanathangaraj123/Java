class WatchShopRunner{
public static void main(String brand[]){

   boolean names = WatchShop.addWatchBrandNames("Rolex");
   System.out.println("The WatchNames are "+names);
   
   names = WatchShop.addWatchBrandNames("Omega");
   System.out.println("The WatchNames are "+names);
   
   names = WatchShop.addWatchBrandNames("Tag Heuer");
   System.out.println("The WatchNames are "+names);
   
   names = WatchShop.addWatchBrandNames("Casio");
   System.out.println("The WatchNames are "+names);
   
   names = WatchShop.addWatchBrandNames("Tissot");
   System.out.println("The WatchNames are "+names);
   
   names = WatchShop.addWatchBrandNames("Panerai");
   System.out.println("The WatchNames are "+names);
   
   names = WatchShop.addWatchBrandNames("IWC Schaffhausen");
   System.out.println("The WatchNames are "+names);
   
   names = WatchShop.addWatchBrandNames("Fossil");
   System.out.println("The WatchNames are "+names);
   
   names = WatchShop.addWatchBrandNames("Movado");
   System.out.println("The WatchNames are "+names);
   
   names = WatchShop.addWatchBrandNames("Swatch");
   System.out.println("The WatchNames are "+names);
   
   
  WatchShop.getAllWatchBrands();
  
  boolean updtaedData =WatchShop.updateWatchBrands("Swatch","Hublot");
  System.out.println("The updated items are " +updtaedData);
  WatchShop.getAllWatchBrands();
  
  boolean DeletedData =WatchShop.deletedWatchBrand("Movado");
  System.out.println("The deleted items are " +DeletedData);
  WatchShop.getAllWatchBrands();
  }
  }
   
   