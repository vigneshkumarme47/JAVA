import java.io.*;
import java.util.Scanner;
class sai
  {
   public void main(String args[])
   {
    int [] a = new int[6] ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers");
    for(int k=0;k<6;k++)
{     a[k] = sc.next();  }
    for(int s=0;s<6;s++)
    { if(a[s]<0)
     System.out.println("only positive numbers must be given");
    }
    
    for(int i=0;i<6;i++)
    {
     for(int j=1;j<5;j++)
    {
     if(a[i]<a[j])
         {  a[i]=a[j];  }
     }
    }
   int  ans = a[0];
    System.out.println("The least element in the array is "+ans" and the numbre less than "+ans" is "(ans-1));
 }
}
   
   

   
