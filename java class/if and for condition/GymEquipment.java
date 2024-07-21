class Gym{
static String gymEquipments[]={null,null,null,null,null,null,null,null};
static int Index;
	public static boolean createGymEquipment(String gymEquipment){
	boolean isgymEquipmentcreated= false;
	if(gymEquipments!=null){
	gymEquipments[Index]=gymEquipment;
	Index++;
	isgymEquipmentcreated = true;
	}else{
	System.out.println("gymEquipment  not found");
	
	
return isgymEquipmentcreated;
}
public static boolean getGymEquipmentName()
{
boolean isgetName=false;
for(gymEquipment:gymEquipments)
System.out.println(gymEquipment);
isgetName=true;
}
return isgetName;
}
}
	