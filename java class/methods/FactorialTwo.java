class FactorialTwo{

public static int toGet(int factorialNumber)
{
System.out.println("method started");
int fact=1;
for(int num=1;num<=factorialNumber;num++  )
{
fact = num*fact;
}
System.out.println("The Factorial of number of" +factorialNumber+  "is"  +fact );

System.out.println(" method ended");
return fact;
} 
}