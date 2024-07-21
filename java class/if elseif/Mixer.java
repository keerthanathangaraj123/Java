class Mixer{
static boolean isConnected;
static int currentSetting;
static int minimumSetting;
static int maximiumSetting=6;
public static void onOrOff()
{
System.out.println("method started");
if(isConnected == false){
isConnected = true;
System.out.println("Mixer is on");
}
else if(isConnected == true){
isConnected = false;
System.out.println("Mixer is off");
}
System.out.println("method ended");
return;
}



public static void increaseSetting(){
	System.out.println("increaseSetting started");
	if(isConnected == true){
		if(currentSetting < maximiumSetting){
			currentSetting = currentSetting+1;
			System.out.println("The maximiumSetting is " +currentSetting);
	}
	else{
		System.out.println("Mixer reached the maximiumSetting");
	}
	}else{
		System.out.println("on the Mixer");
	}
	System.out.println("increaseSetting ended");
	return;
}


public static void decreaseSetting(){
	System.out.println("decreaseSetting started");
	if(isConnected == true){
		if(currentSetting > minimumSetting){
			currentSetting = currentSetting-1;
			System.out.println("The minimumSetting is "+currentSetting);
		}
		else {
			System.out.println("Mixer reached the minimumSetting");
		}
	}else{
		System.out.println("on the Mixer");
	}
	System.out.println("decreaseSetting ended");
}
}

			

