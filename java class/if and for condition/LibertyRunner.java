class LibertyRunner{
   public static void main(String brands[]){
       
	   boolean isBrandName =Liberty.addShoeBrands("Nike"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	   isBrandName =Liberty.addShoeBrands("Adidas"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	   isBrandName =Liberty.addShoeBrands("Puma"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	   isBrandName =Liberty.addShoeBrands("Reebok"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	   isBrandName =Liberty.addShoeBrands("New Balance"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	   isBrandName =Liberty.addShoeBrands("Asics"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	   isBrandName =Liberty.addShoeBrands("Under Armour"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	   isBrandName =Liberty.addShoeBrands("Skechers"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	   isBrandName =Liberty.addShoeBrands("Vans"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	   isBrandName =Liberty.addShoeBrands("Converse"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	   isBrandName =Liberty.addShoeBrands("Timberland"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	   isBrandName =Liberty.addShoeBrands("Clarks"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	   isBrandName =Liberty.addShoeBrands("Hush Puppies"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	   isBrandName =Liberty.addShoeBrands("Dr. Martens"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	   isBrandName =Liberty.addShoeBrands("Merrell"); 
       System.out.println("The Brand name is "+isBrandName);
	   
	  Liberty .getBrandName();
	  
	  
	  boolean isupdateNames = Liberty.updateBrandNames("Merrell","bmw");
	  System.out.println("The updated Names are "+isupdateNames);
	  Liberty .getBrandName();
	  
	  boolean isdeletedNames = Liberty.deleteBrandName("Hush Puppies");
	  System.out.println("The deleted Names are "+isdeletedNames);
	  Liberty .getBrandName();
	  
   }
   
}
	   