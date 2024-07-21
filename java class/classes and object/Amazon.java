class Amazon{
static String fullName;
static String lastName;
static long phoneNumber;
static  String email;
static int otp;


public  boolean createAccount(String fullName,String lastName ,long phoneNumber , String email, int otp ){

boolean isaccountCreated=false;
this.fullName = fullName;
this.fullName = lastName;
this.phoneNumber = phoneNumber;
this.email = email;
this.otp = otp;
isaccountCreated = true;

return  isaccountCreated;
}

public void getDetails()
{
System.out.println("The first Name is "+fullName);
System.out.println("The last Name is "+lastName);
System.out.println("The mobile Number is "+phoneNumber);
System.out.println("The user id is "+email);
System.out.println("The one time password is "+otp);
}
}








