class AmusementParkRunner{

    public static void main(String data[]){
		AmusementPark Ap = new AmusementPark();
		Ap.play();
		boolean isData = Ap.createDetails("Water Games","Bangalore","30 games");
		System.out.println("The details are AmusementPark" 	+isData);
		Ap.getDetails();
	}
}
		 
		
