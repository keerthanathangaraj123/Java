class Agarbathi {
    String brandName;
    String id;
    String noOfSticks;
    String fragnance;
    double price;
    
    public void smell() {
        System.out.println("It is used for good fragrance");
    }
    
    public boolean createDetails(String brandName, String id, String noOfSticks, String fragnance, double price) {
        boolean isDetailsCreated = false;
        if (brandName != null && id != null && noOfSticks != null && fragnance != null && price > 0.0) {
            this.brandName = brandName;
            this.id = id;
            this.noOfSticks = noOfSticks;
            this.fragnance = fragnance;
            this.price = price;
            isDetailsCreated = true;
        }
        return isDetailsCreated;
    }
    
    public void getDetails() {
        System.out.println("The brandName is " + this.brandName);
        System.out.println("The id is " + this.id);
        System.out.println("The number of sticks is " + this.noOfSticks);
        System.out.println("The fragrance is " + this.fragnance);
        System.out.println("The price of the Agarbathi is " + this.price);
    }
}