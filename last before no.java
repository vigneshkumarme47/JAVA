import java.io.*;
import java.util.Scanner;
class mahesh
 { 
    public static void main(String args[])
     {
       int m,sum=0;
      int [] a = new int[6] ;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter values");
       int g;
      for(int s=0;s<6;s++)
      {  a[s] = sc.nextInt();   }
     
 for (int i = 0; i < 6; i++)
    {
        for (int j = i + 1; j < 6; j++)
        {
            if (a[i] >a[j])
            {
                g = a[i];
                a[i] = a[j];
                a[j] = g;
            }
        }
    }

       System.out.println("The least number before no is");
       if((a[0])==0)
       System.out.println("0");
       else
       System.out.println((a[0]-1));
    }
}
