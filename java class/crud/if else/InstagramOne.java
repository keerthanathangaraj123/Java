class InstagramOne{
static String fName;
static String lName;
static long conNumber;
static String emailId;
static String pwd;
public static boolean getAccount(String fullName, String lastName, long phoneNumber , String email , String password)
{
boolean isaccountCreated = false;
if(fullName !=null && lastName !=null && phoneNumber >0 && email != null && password != null){
fName = fullName;
lName = lastName;
conNumber = phoneNumber;
emailId = email;
pwd = password;
isaccountCreated = true;
}else{
System.out.println("provide the proper details");
}

return isaccountCreated;
}

public static void getInstaAccount(){
System.out.println("The First name is "+fName);
System.out.println("The Last name is "+lName);
System.out.println("The mobile number is "+conNumber);
System.out.println("The user id  is "+emailId);
System.out.println("The password is "+pwd);
}
}


















