import java.io.*;
import java.util.Scanner;
class large
  {
    public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
     int [] a = new int[100] ;
     int [] b = new int[100] ;
     System.out.println("Enter the numer of vlaues ");
    int n = sc.nextInt();
     System.out.println("Enter the values");
     for(int i=0;i<n;i++)
     {
       a[i] = sc.nextInt();
     }
    for(int i=0;i<n;i++)
     {
       b[i] =a[i];
     }
   for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {  
         if(a[i]<a[j])
          {
          int temp;
          temp=a[i];
          a[i] = a[j];
          a[j]=temp;  
         }
      }
    }
   for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {  
         if(b[i]>b[j])
          {
          int tem;
          tem=b[i];
          b[i] = b[j];
          b[j]=tem;  
         }
        
      }
    }
    System.out.println("The values are"); 
int x=n/2;
if(n%2==0)
{
  for(int k=0;k<x;k++)
   {
     System.out.println(a[k]); 
     System.out.println(b[k]); 
    }
}
else
{
  for(int k=0;k<x;k++)
   {
     System.out.println(a[k]); 
     System.out.println(b[k]); 
    }
     System.out.println(a[n-2]); 
}
}
}
