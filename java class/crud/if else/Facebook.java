class Facebook{
static String fName;
static String lName;
static long phoneNumber;
static String emailId;
static String password;
public static boolean createAccount(String fullName, String lastName , long concactNumber , String userId ,String VerificationNumber){
boolean isAccountCreated = false;
if(fullName!=null && lastName!=null && concactNumber >0 && userId!=null && VerificationNumber!=null){
fName=fullName;
lName=lastName;
phoneNumber=concactNumber;
emailId=userId;
password=VerificationNumber;

isAccountCreated = true;
}
else{
System.out.println("provide the proper details");
}
return isAccountCreated;
}

public static void getDeatils()
{
System.out.println("The first name is "+fName);
System.out.println("The lastName is "+lName);
System.out.println("The concactNumber is "+phoneNumber);
System.out.println("The userIdId is "+emailId);
System.out.println("The password is "+password);
}
}