class createApplication{
public static void main(String information[]){
boolean data = LoanApplication.getLoan("8954125856" , 
"state bank of india" ,800 ,5.25 ,"educationLoan");
System.out.println("The loanApplication details are "+data);
LoanApplication.getInformation();
}
}