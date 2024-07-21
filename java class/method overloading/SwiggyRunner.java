class SwiggyRunner{
public static void main(String foodPrice[]){
System.out.println("main started");
double food = Swiggy.foodAmount("Shawarma");
double food1= Swiggy.foodAmount("FishFry" ,3);
  food1=Swiggy.foodAmount("Onion Rings" ,3);
  System.out.println("The price of foodItem is "+food1);
 food1=Swiggy.foodAmount("PesPi" ,3);
 System.out.println("The price of foodItem is "+food1);
 
 food1=Swiggy.foodAmount("Shawarma" ,3);
 System.out.println("The price of foodItem is "+food1);
 food1=Swiggy.foodAmount("fries" ,3);
 System.out.println("The price of foodItem is "+food1);
 food1=Swiggy.foodAmount("cold coffee" ,3);
 System.out.println("The price of foodItem is "+food1);
 food1=Swiggy.foodAmount("Mixed Platter" ,3);
 System.out.println("The price of foodItem is "+food1);
 food1=Swiggy.foodAmount("prawns fry" ,3);
 System.out.println("The price of foodItem is "+food1);



System.out.println("main ended");
}
         
}