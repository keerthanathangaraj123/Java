class  AmazonTester{
public static void main(String deatails[]){
 Amazon Az=new  Amazon();
boolean value = Az.createAccount("Lalitha","Thangaraj",9453124421L,"lalitha123@gmail.com",45215);
System.out.println("Amazon account deatails are" +value);

Amazon data = new  Amazon();
data.getDetails();
}
}