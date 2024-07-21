class Swiggy {
    public static double foodAmount(String foodName) {
		System.out.println("method  started");
        if (foodName == "BlueBerry Cake") {
            return 150.00;
        } else if (foodName == "FishFry") {
            return 400.00;
        } else if (foodName == "Onion Rings") {
            return 200.00;
        } else if (foodName == "PesPi") {
            return 90.00;
        } else if (foodName == "Shawarma") {
            return 250.00;
        } else if (foodName == "fries") {
            return 110.00;
        } else if (foodName == "cold coffee") {
            return 150.00;
        } else if (foodName == "Mixed Platter") {
            return 300.00;
        } else if (foodName == "Mutton Curry") {
            return 500.00;
        } else if (foodName == "prawns fry") {
            return 560.00;
        } else if (foodName == "Nuggets") {
            return 350.00;
        } else if (foodName == "Coke") {
            return 50.00;
        } else if (foodName == "Biriyani") {
            return 500.00;
        } else if (foodName == "periperi Mix") {
            return 400.00;
        } else if (foodName == "Paneer Tika") {
            return 300.00;
        } else if (foodName == "veg platter") {
            return 250.00;
        } else {
            System.out.println("food item not found");
        }
		System.out.println("method ended");
        return 0.0;
    }



public static double foodAmount(String foodName , int quantity){
double price = 0.0;
if(foodName == "FishFry"){
price = 400.00 * quantity;
return price;
}
 if (foodName == "Onion Rings") {
	 price = 200.00*quantity;
	 return price;
 }
 if(foodName  == "PesPi"){
	 price = 90.00*quantity;
	 return price;
 } 
 if(foodName == "Shawarma") {
   price = 250*quantity;         
	return price;
 }
 if (foodName == "fries") {
  price = 110.00 *quantity;
 return price;
 }
  if (foodName == "cold coffee") {
     price = 150.00*quantity;
  return price;
  }
  if(foodName =="Mixed Platter"){
	  price = 300.00*quantity;
	  return price;
  }
  if(foodName =="prawns fry"){
	  price = 560.00*quantity;
	  return price;
  }
  if(foodName =="Nuggets"){
	  price =350.00*quantity;
	  return price;
  }
  if(foodName =="coke"){
	  price =50.00*quantity;
	  return price;
  }
  if(foodName =="Biriyani"){
	  price =500.00*quantity;
	  return price;
  }
  if(foodName == "Paneer Tika"){
	  price =300.00*quantity;
  return price;
  }


return price;
}
}


