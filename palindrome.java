import java.io.*;
import java.util.Scanner;


class sum
{
public static void main(String args[])
{
do{
m=n%10;
sum=(sum*10)+m;
n=n/10;
}while(n>0);
nt n,m,sum=0;
System.out.println("enter a no");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int k=n;
System.out.println("reverse is :"+sum);
if(sum==k)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}
