class PassportTester{
	
	public static void main(String args[]){
		
		//String cprLocation, int dcdLocation,String sirName,String givenName,
//	String dob,String email,boolean isEmailLoginSame,String loginid,String pwd, 
	//String confirmPwd,String hintQues,String hintAns,String captcha
	PassportOne.createPassport("PO",8,"R","Soundarya","04/07/2001","soundryar58@gmail.com",true,
	"soundryar58@gmail.com","123@Sound","123@Sound","color","White","Dv23S26");
	PassportOne.readPassport();
	
}
}