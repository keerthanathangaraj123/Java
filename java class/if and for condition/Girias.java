class Girias{
static String homeAppliances[]={null,null,null,null,null,null,null,null,null,null,null,null};
static int index;


    public static boolean createhomeAppliance(String homeAppliance){
    boolean isHomeAppliances = false;
    if(homeAppliances!=null){
	homeAppliances[index] = homeAppliance;
	index++;
	isHomeAppliances = true;
	}else{
	System.out.println("homeAppliance not found");
	}
	
	return isHomeAppliances;
	}
	 
	public static void getHomeAppliances()
	{
	for( String homeAppliance:homeAppliances){
	System.out.println(homeAppliance);
	}
	}
	
	
	
	
	public static boolean updateApplicanesName(String oldNames , String newNames)
	{
		boolean isUpdatedHomeApplicanes = false;
		for(int index =0;index<homeAppliances.length;index++){
			if(oldNames == homeAppliances[index]) {
				homeAppliances[index] = newNames;
				isUpdatedHomeApplicanes  = true;
				
			}
		}
		if(isUpdatedHomeApplicanes == false){
			System.out.println("homeAppliance not found");
		}
	
	return isUpdatedHomeApplicanes;
	}
}

			
	
	