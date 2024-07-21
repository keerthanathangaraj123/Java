class AgarbathiTester {
    public static void main(String[] args) {
        Agarbathi ref = new Agarbathi();
        ref.smell();
        
        Agarbathi data = new Agarbathi();
        boolean isDataCreated = data.createDetails("Cycle Pure", "123", "20 Packs", "Jasmine fragrance", 450.00);
        System.out.println("The details of the Agarbathi is " + isDataCreated);
        
        data.getDetails();
    }
}