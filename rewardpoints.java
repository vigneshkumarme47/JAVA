import java.io.*;
import java.util.Scanner;
class customer
{
 int id;
 String name,address;
 public customer(){}
 public customer(int id,String name,String address) 
 {
 this.id = id;
 this.name= name;
 this.address=address;
 }
 public void display()
 {
 System.out.println("Customer id : "+id);
 System.out.println("Name : "+name);
 System.out.println("Address : "+address);
 }
}
interface rewardpoints
{
  
 void calculate();
   
   
}
class demo extends customer implements rewardpoints
{
public demo(){}
 public demo(int id,String name,String address) 
 {
 this.id = id;
 this.name= name;
 this.address=address;
 }
 public void calculate()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the purchase amount : ");
    int x=sc.nextInt();
    if(x>10000){
    System.out.println("Your reward points is 101 : ");}
     else{
     System.out.println("Your reward points is 51 : ");
   }}

public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the id : ");
 int id=sc.nextInt();
 System.out.println("Enter the name : ");
 String name=sc.next();
 System.out.println("Enter the address : ");
 String address=sc.next();c
  
 demo obj = new demo(id,name,address);
   obj.calculate();
   obj.display();
    
 
 
 }
}
 
