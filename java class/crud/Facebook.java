class Facebook{
static String fName;
static String lName;
static  String passwd;
static long phoneNo;
static String email;
public static boolean facebookCreation(String firstName, String lastName , String password , long contactNumber,
String emailId)
{
boolean isAccountCreated = false;
fName = firstName;
lName = lastName;
passwd = password;
phoneNo = contactNumber;
email = emailId;
isAccountCreated = true;

return isAccountCreated;
}
 
 public static void getDetails()
 {
 System.out.println(" The firstName is " +fName);
System.out.println(" The lastName is " +lName);
System.out.println(" The password is " +passwd);
System.out.println(" The contactNumber  is " +phoneNo);
System.out.println(" The emailId is " +email);
}}








