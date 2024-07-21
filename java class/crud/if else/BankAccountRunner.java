class BankAccountRunner{
public static void main(String AxisBank[]){
BankAccount.credit(0);
double amount = BankAccount.getAmount();
BankAccount.credit(0);
BankAccount.credit(0);
System.out.println("The final Amount is "+amount);
BankAccount.debit(79883.90);

amount = BankAccount.getAmount();
System.out.println("The final Amount is "+amount);
BankAccount.debit(79883.90);
double closingBalance = BankAccount.getAmount();



System.out.println("The closingBalance is "+closingBalance);
}
}