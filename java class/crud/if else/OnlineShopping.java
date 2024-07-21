class OnlineShopping{
static  String fstName;
static  String lstName;
static  String userId;
static long contNumber;
static String verificationdata;
public static boolean getShopping(String firstName , String lastName , 
String emailId , long phoneNumber , String userPassword){
boolean isfirstNameValid = false;
boolean islastNameValid = false;
boolean isemailIdValid = false;
boolean isphoneNumberValid = false;
boolean isuserPasswordValid = false;
boolean isOnlineShoppingValid = false;

if(firstName!= null){
fstName = firstName;
isfirstNameValid = true;
}else{
System.out.println("please provide the proper details of firstName");
}

if(lastName !=null){
lstName = lastName;
islastNameValid = true;
}else{
System.out.println("please provide the proper details of lastName");
}

if(emailId !=null){
userId = emailId;
isemailIdValid = true;
}else{
System.out.println("please provide the proper details of userId");
}

if(phoneNumber !=0L){
contNumber=phoneNumber;
isphoneNumberValid = true;
}else{
System.out.println("please provide the proper details of phoneNumber");
}

if(userPassword !=null){
verificationdata = userPassword;
isuserPasswordValid = true;
}else{
System.out.println("please provide the proper details of userPassword");
}

if(isuserPasswordValid && isemailIdValid && isfirstNameValid && islastNameValid &&isphoneNumberValid){
isOnlineShoppingValid = true;
}
return isOnlineShoppingValid;
}

public static void storeInformation()
{
System.out.println("The details of firstName "+fstName);
System.out.println("The details of lastName "+lstName);
System.out.println("The details of emailId "+userId);
System.out.println("The details of mobile Number "+contNumber);
System.out.println("The details of password "+verificationdata);



}
}