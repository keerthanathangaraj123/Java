class FoodPanda{
public static double getFood(String items){
System.out.println("method started");
if(items == "Spring Rolls") return 100.00;
if(items == "Garlic Bread") return 40.00;
if(items == "Chicken Wings ") return 100.00;
if(items == "Paneer Tikka") return 50.00;
if(items == "Vegetable Biryani ") return 52.00;
if(items == "Paneer Butter Masala ") return 150.00;
if(items == "Butter Chicken") return 200.00;
if(items == "Mutton Rogan Josh ") return 450.00;
if(items == "Dal Makhani") return 50.00;
if(items == "Chole Bhature") return 80.00;
if(items == "Pasta Alfredo ") return 40.00;
if(items == "Pizza Margherita ") return 40.00;
if(items == "Grilled Fish") return 70.00;
if(items == "Chocolate Cake") return 50.00;
if(items == "Gulab Jamun ") return 67.00;
if(items == "Ice Cream Sundae") return 40.00;
else 
System.out.println("items not found");

return 0.0;

}
}





