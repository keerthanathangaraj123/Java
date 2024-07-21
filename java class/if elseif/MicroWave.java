class MicroWave{
static boolean isConnected;
static int currentTemperature;
static int minimumTemperature;
static int maximiumTemperature=6;
public static void onOrOff()
{
System.out.println("method started");
if(isConnected == false){
isConnected = true;
System.out.println("MicroWave is on");
}
else if(isConnected == true){
isConnected = false;
System.out.println("MicroWave is off");
}
System.out.println("method ended");
return;
}



public static void increaseTemperature(){
	System.out.println("increaseTemperature started");
	if(isConnected == true){
		if(currentTemperature < maximiumTemperature){
			currentTemperature = currentTemperature+1;
			System.out.println("The maximiumTemperature is " +currentTemperature);
	}
	else{
		System.out.println("MicroWave reached the maximiumTemperature");
	}
	}else{
		System.out.println("on the MicroWave");
	}
	System.out.println("increaseTemperature ended");
	return;
}


public static void decreaseTemperature(){
	System.out.println("decreaseTemperature started");
	if(isConnected == true){
		if(currentTemperature > minimumTemperature){
			currentTemperature = currentTemperature-1;
			System.out.println("The minimumTemperature is "+currentTemperature);
		}
		else {
			System.out.println("MicroWave reached the minimumTemperature");
		}
	}else{
		System.out.println("on the MicroWave");
	}
	System.out.println("decreaseTemperature ended");
}
}

			

