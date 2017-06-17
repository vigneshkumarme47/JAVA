import java.io.*;
import java.util.Scanner;
class Multi extends Thread 
{
 public void run(){
System.out.println("thread is running...");
}
 public static void main(String args[])
{
Multi t1=new Multi();
//Thread t1=new Thread(new Multi());
t1.start();
}
}
