class AirConditioner{
static boolean isConnected;
static int currentTemperature ;
static	int minimumTemperature;
static int maximiumTemperature=6;

public static void onOrOff()
{
System.out.println("method started");
isConnected isConnected == false ? true:false;
System.out.println("AirConditioner is on " +isConnected);
}
else if (isConnected == true){
isConnected = false;
System.out.println("AirConditioner is off");
}
System.out.println("method ended");
return;
}


public static void incresaseTemperature(){
	System.out.println("method started");
	if(isConnected == true){
		if(currentTemperature < maximiumTemperature){
			currentTemperature = currentTemperature+1;
			System.out.println("currentTemperature is "+currentTemperature);
		}else{
			System.out.println("Ac reached the maximiumTemperature");
		}
		}else{
			System.out.println("turn on the Ac");
		}
		System.out.println("method ended");
		return;
}
		
		


public static void decreaseTemperature() {
        System.out.println("decreaseTemperature started");

        if (isConnected == true) {
            if (currentTemperature > minimumTemperature) {
                currentTemperature=currentTemperature-1;
                System.out.println("Temperature decreased to " + currentTemperature);
            } else {
                System.out.println("It has reached the minimum Temperature");
            }
        } else {
            System.out.println("Turn on the AC");
        }

        System.out.println("decreaseTemperature ended");
		return;
    }
}	