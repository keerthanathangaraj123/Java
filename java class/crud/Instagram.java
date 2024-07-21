class Instagram{

static String Fname;
static String Lname;
static String eid;
static String pwd;
static long phoneNo;
static String conPwd;
static int otp;

public static boolean createInstagram(String firstName,String lastName , String emailId , String password, 
long phoneNumber,String confirmPassword, int verificationid){
boolean isInstagramCreated = false;
Fname = firstName;
Lname = lastName;
eid = emailId;
pwd = password;
phoneNo = phoneNumber;
conPwd = confirmPassword;

otp = verificationid;
isInstagramCreated = true;



return isInstagramCreated;
}

public static void getDetails(){
System.out.println("The firstName is :" +Fname);
System.out.println("The lastName is :" +Lname);
System.out.println("The emailId is :" +eid);
System.out.println("The password is :" +pwd);
System.out.println("The phoneNumber is :" +phoneNo);
System.out.println("The confirmPassword is :" +conPwd);

System.out.println("The verificationid is :" +otp);
}












}