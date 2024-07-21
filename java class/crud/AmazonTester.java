class AmazonTester{
public static void main(String deatails[]){
//String fullNmae,String lastName ,long phoneNumber , String email, int otp, 
boolean value = Amazon.createAccount("Lalitha","Thangaraj",9453124421L,"lalitha123@gmail.com",45215);
System.out.println("Amazon account deatails are" +value);
Amazon.getDetails();
}








}