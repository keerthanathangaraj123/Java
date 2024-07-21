class BatteryRunner{
    public static void main(String charge[]){
	
	Battery value = new Battery();
	value.charge();
	boolean isDataCreated = value.createDetails("6765","98Kg","EveryDay");
	System.out.println("The Battery data is "+isDataCreated);
	value.getDetails();
	}
}