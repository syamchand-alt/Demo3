import java.util.*;
class Palindromenumber
{
   public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
   int temp,n,rem,rev=0;
   System.out.println("Enter the value of n");
   n=sc.nextInt();
   temp=n;
   while(n!=0)
   {
   rem=n%10;
   rev=rev*10+rem;
   n=n/10;
   if(temp==rev)
     System.out.println("it is palindrome");
  else
    System.out.println("it is not palindrome");
   }
  }
}
