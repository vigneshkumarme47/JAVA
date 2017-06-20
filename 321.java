import java.io.*;
import java.util.Scanner;
class mahesh
 { 
    public static void main(String args[])
     {
       int m,sum=0;
      int [] a = new int[6] ;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a no");
      int x = sc.nextInt();
      int p=0,l=0,g;
     
      if(x<=9)
      
      System.out.println("invalod no "); 
          
      else
  
     while(x>0)
     {
       a[p] = x% 10;
       x=x/10;
       p++;l=l+1;
     } 
 for (int i = 0; i < l; i++)
    {
        for (int j = i + 1; j < l; j++)
        {
            if (a[i] < a[j])
            {
                g = a[i];
                a[i] = a[j];
                a[j] = g;
            }
        }
    }
       System.out.print("The reverse is");
        for(int k=0;k<l;k++)
        {System.out.print(a[k]);}
    
    }
}
