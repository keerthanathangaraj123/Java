class InstaCreation{
static  String fname;
static  String lname;
static  long contactNumber;
static  String email;
static  String verficationNumber;

public static boolean instaAccount(String fullName , String lastName , long phoneNumber , String emailId ,String password){
boolean isFullNameValid = false;
boolean isLastNameValid = false;
boolean isPhoneNumberValid=false;
boolean isEmailIDValid = false;
boolean isUserPassword = false;
boolean isAccountCreated = false;

if(fullName !=null){
fname = fullName;
isFullNameValid = true;
}else{
System.out.println("please provide the proper fullName");
}
if (lastName !=null){
lname = lastName;
isLastNameValid = true;
}else{
System.out.println("please provide the proper lastName");
}
if(phoneNumber>0){
contactNumber=phoneNumber;
isPhoneNumberValid =true;
}else{
System.out.println("please provide the proper phoneNumber");
}
if(emailId!=null){
email=emailId;
isEmailIDValid = true;
}else{
System.out.println("please provide the proper  email");
}
if(password!=null){
verficationNumber=password;
isUserPassword = true;
}else{
System.out.println("please provide the proper password");
}



if(isFullNameValid && isLastNameValid && isPhoneNumberValid && isEmailIDValid && isUserPassword){
	isAccountCreated = true;
}

return isAccountCreated;
}
public static void getInformation()
{
System.out.println("The first name is "+fname);
System.out.println("The last name is "+lname);
System.out.println("The Mobile Number is "+contactNumber);
System.out.println("The user id is "+email);
System.out.println("The password is "+verficationNumber);
}
}
 







