class Bill{
//static variable
static int billId = 101;
static  String billIssueDate = "12/06/2024";
static String billDueDate = "26/06/2024";
static boolean isBillPaid = false;
static boolean isLatestBill=true;
public static void main(String args[]){
//local variable
String billIssueDate = "12/06/2024";
String billDueDate = "26/06/2024";

System.out.println("---------------------------");
System.out.println("The Bill id is:" + billId);
System.out.println("The Bill is issued on:" + billIssueDate);
System.out.println("Then Bill is Due Date is:" + billDueDate);
System.out.println(isLatestBill);
System.out.println("----------------------------");
}
}