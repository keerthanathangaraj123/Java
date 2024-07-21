class Passport{
	
	 String cprLocation;
	 int dcdLocation;
	 String sirName;
	 String givenName;
	 String dob;
	 String email;
	 boolean isEmailLoginSame;
	 String  loginid;
	 String password;
	 String confirmPwd;
	 String hintQues;
	 String hintAns;
	 String captcha;
	
	public Passport(){
	System.out.println("user object is created");
	}
	
	
 public static boolean createPassport(String cprLocation, int dcdLocation,String sirName,String givenName,
	String dob,String email,boolean isEmailLoginSame,String loginid,String pwd, 
	String confirmPwd,String hintQues,String hintAns,String captcha)
	
	{
	
	boolean isAccountCreated=false;
   if(cprLocation !=null && dcdLocation > 0 && sirName != null && givenName!=null && dob!=null && email !=null && isEmailLoginSame !=false && 
   loginid !=null && pwd !=null &&  confirmPwd !=null && hintQues !=null && hintAns != null && captcha!= null){
		this.cprLocation=cprLocation;
		this.dcdLocation=dcdLocation;
		this.sirName=sirName;
		this.givenName=givenName;
		this.dob=dob;
		this.email=email;
		this.isEmailLoginSame=isEmailLoginSame;
		this.loginid=loginid;
		this.pwd=pwd;
		this.confirmPwd=confirmPwd;
		this.hintQues=hintQues;
		this.hintAns=hintAns;
		this.captcha=captcha;

		
		isAccountCreated=true;
   
   } 
			else {
			System.out.println("validate it");
	}
		
	
		
		return isAccountCreated;
		
	}
	public static void readPassport(){
	 
		
		System.out.println("cpr Location is :"+cprLoc);
		System.out.println("dcd Location is :"+dcdloc);
		System.out.println("sirname is :"+lastName);
		System.out.println("Name :"+name);
		System.out.println("date of birth :"+dateOfBirth);
		System.out.println("emai :"+emailid);
		System.out.println("is email and login id are same "+isLoginsame);
		System.out.println("loginid is :"+idLogin);
		System.out.println("password :"+pswrd);
		System.out.println("confrim Password:"+cnfrmPswrd);
		System.out.println("hint Question :"+ques);
		System.out.println("hint answer is :"+ans);
		System.out.println("captcha is :"+captchaa);
		
		
	}
}