class BillRunner{
   public static void  main(String Amount[]){
   
   Bill payed = new Bill();
   payed.BillId=0001;
   payed.isBillPayed = false;
   payed.billIssuedDate="14-06-2024";
   payed.billDueDate="14-06-2024";
   
System.out.println("The billid is "+payed.BillId);
System.out.println("isBillPayed " +payed.isBillPayed);

System.out.println("billIssuedDate " +payed.billIssuedDate);
System.out.println("billDueDate "+payed.billDueDate);
}
}
 
 
 
 
 
 
 