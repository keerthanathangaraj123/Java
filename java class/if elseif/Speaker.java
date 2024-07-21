class Speaker{
static boolean isConnected;
static int currentSound;
static int minimumSound;
static int maximiumSound=6;
public static void onOrOff()
{
System.out.println("method started");
if(isConnected == false){
isConnected = true;
System.out.println("Speaker is on");
}
else if(isConnected == true){
isConnected = false;
System.out.println("Speaker is off");
}
System.out.println("method ended");
return;
}



public static void increaseSound(){
	System.out.println("increaseSound started");
	if(isConnected == true){
		if(currentSound < maximiumSound){
			currentSound = currentSound+1;
			System.out.println("The maximiumSound is " +currentSound);
	}
	else{
		System.out.println("Speaker reached the maximiumSound");
	}
	}else{
		System.out.println("on the Speaker");
	}
	System.out.println("increaseSound ended");
	return;
}


public static void decreaseSound(){
	System.out.println("decreaseSound started");
	if(isConnected == true){
		if(currentSound > minimumSound){
			currentSound = currentSound-1;
			System.out.println("The minimumSound is "+currentSound);
		}
		else {
			System.out.println("Speaker reached the minimumSound");
		}
	}else{
		System.out.println("on the Speaker");
	}
	System.out.println("decreaseSound ended");
}
}

			


