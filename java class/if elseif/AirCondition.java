class AirCondition{
static isConnected = false;

public static void onOrOff()
{
System.out.println("method started");
if(isConnected == false){
isConnected = true;
System.out.println("AirConditioner is on");
}
else if(isConnected == true){
isConnected = false;
System.out.println("AirConditioner is off");
}
System.out.println("method ended");
return;
}



