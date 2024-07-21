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
}
