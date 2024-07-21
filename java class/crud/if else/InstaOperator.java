class InstaOperator{
//String fullName , String lastName , long phoneNumber , String emailId ,String password
public static void main(String details[]){
boolean isAccountCreated =InstaCreation.instaAccount("shiva","linga",9452121345L ,"shivalinga333@gmail.com","shiva333");

	InstaCreation.getInformation();

System.out.println("The details are " +isAccountCreated);

}

}
