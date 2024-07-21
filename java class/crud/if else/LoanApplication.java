class LoanApplication{
static String accountNo;
static String bankNme;
static int cdtScore;
static double rOI;
static String typeOfLoan;
public static boolean getLoan(String bankAccountNumber , 
String bankName ,int creditScore ,double rateOfInterest ,String loanType){
boolean isbankAccountNumberValid = false;
boolean isbankNameValid = false;
boolean iscreditScoreValid = false;
boolean israteOfInterestValid = false;
boolean isloanTypeValid =false;
boolean isAccountCreated=false;

if(bankAccountNumber !=null){
accountNo = bankAccountNumber;
isbankAccountNumberValid = true;
}else{
System.out.println("please provide proper details of accountNo");
}

if(bankName !=null){
bankNme = bankName;
isbankNameValid = true;
}else{
System.out.println("please provide proper details of bankAccountNumber");
}

if(creditScore >750){
cdtScore = creditScore;
iscreditScoreValid = true;
}else{
System.out.println("please provide proper details of creditScore");
}

if(rateOfInterest !=0.0){
rOI = rateOfInterest;
israteOfInterestValid = true;
}else{
System.out.println("please provide proper details of rateOfInterest");
}

if(loanType !=null){
typeOfLoan = loanType;
isloanTypeValid = true;
}else{
System.out.println("please provide proper details of loanType");
}

if(isbankAccountNumberValid && isbankNameValid && iscreditScoreValid && isloanTypeValid && israteOfInterestValid){
isAccountCreated = true;

}
return isAccountCreated;

}
public static void getInformation(){
System.out.println("The details of "+accountNo);
System.out.println("The details of "+bankNme);
System.out.println("The details of "+cdtScore);
System.out.println("The details of "+rOI);
System.out.println("The details of "+typeOfLoan);
}





}