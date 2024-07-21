class MoreSuperMarket{
    static String[] chocolates = {"KitKat", "Dairy Milk", "Snikers", "Silk", "munch", "oreo"};
    static String[] beverages = {"Coke", "Pepsi", "Sprite", "Fanta", "7Up"};
    static String[] snacks = {"Chips", "Nachos", "Pretzels", "Popcorn", "Crackers"};
    static String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Pineapple"};
    static String[] vegetables = {"Carrot", "Broccoli", "Spinach", "Tomato", "Cucumber"};
    static String[] dairy = {"Milk", "Cheese", "Yogurt", "Butter", "Cream"};
    

    public static void main(String[] items)
	{
	System.out.println("The chocolates in the supermarket are:-");
	for(int index=0;index<chocolates.length;index++)
	{
	System.out.println(chocolates[index]);
	}
	

System.out.println("The beverges are:-");
for(String beverages:beverages){
	System.out.println(beverages);
	}


System.out.println("The snacks are :-");
for(int index=0;index<snacks.length;index++)
{
	System.out.println(snacks[index]);
}

System.out.println("The fruits are :-");
for(int index=0;index<fruits.length;index++)
{
	System.out.println(fruits[index]);
}

System.out.println("The vegetables are :-");
for(String vegetables:vegetables)
{
	System.out.println(vegetables);
}

System.out.println("The dairy are:-");
for(int index=0;index<dairy.length;index++)
{
	System.out.println(dairy[index]);
}
}
}	

        