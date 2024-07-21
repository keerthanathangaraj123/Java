import java.util.*;
class Gym{
static String gymEquipments[]={null,null,null,null,null,null,null,null};
static int Index;
	public static boolean gymEquipment(String gymEquipment){
	boolean isgymEquipmentcreated= false;
	
        	if(gymEquipment!=null)
	       {
	        gymEquipments[Index]=gymEquipment;
	        Index++;
	        isgymEquipmentcreated = true;
	    }else{
	    System.out.println("gymEquipment  not found");
	
	   }
       return isgymEquipmentcreated;
        }
	
public static void getGymEquipmentName()
{
for(String gymEquipment:gymEquipments)
System.out.println(gymEquipment);
}

public static boolean updatedItem(String oldEquipmentName, String newEquipmentName)
{
	boolean isItemCreated = false;
	for(int index = 0;index<gymEquipments.length;index++)
	{
		if(oldEquipmentName == gymEquipments[index]){
			gymEquipments[index] = newEquipmentName;
		}
		isItemCreated = true;
	}
	if(isItemCreated ==  false){
		System.out.println("gymEquipment not found");
	}
	return isItemCreated;
}

public static boolean deletedEquipment(String equipmentToBeDeleted){
	boolean isEquipmentToBeDeleted= false;
	int oldIndex , newIndex;
	for(newIndex = 0,oldIndex = 0;oldIndex<gymEquipments.length;oldIndex++){
		if(gymEquipments[oldIndex] !=equipmentToBeDeleted){
		gymEquipments[newIndex]=gymEquipments[oldIndex];
		newIndex++;
		}
	}
	gymEquipments = Arrays.copyOf(gymEquipments , newIndex);
	if(gymEquipments!=null){
		isEquipmentToBeDeleted = true;
	}
	if(isEquipmentToBeDeleted == false){
		System.out.println("equipmentToBeDeleted not found");
	}
return isEquipmentToBeDeleted;
}
}




	