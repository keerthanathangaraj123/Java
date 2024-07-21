class FacebookRunner{
public static void main(String datails[]){
//String firstName, String lastName , String password , long contactNumber,
//String emailId)

boolean creation = Facebook.facebookCreation("lakshanika","Thangaraj","laks123",9594856123L ,"lakshanika123@gmail.com");
System.out.println("The creation is " +creation);
Facebook.getDetails();
}



}