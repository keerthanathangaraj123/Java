class InstaRunner{
public static void main(String details[]){
// String firstName,String lastName , String emailId, String password, 
// long phoneNumber,String confirmPassword,  int verificationid

boolean instaCreation = Instagram.createInstagram("keerthana", "T", "keerthana132@gmail.com","keerthi123",8873676777l,
"keerthi123", 45455);
System.out.println("The instaDetails are "+instaCreation);

Instagram.getDetails();
}
}







