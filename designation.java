import java.io.*;
import java.util.Scanner;
class employee
{
int empid;
String name;
String designation;
String address;
public employee(){}
public employee(int empid,String name,String designation,String address)
 {
 this.empid = empid;
 this.name = name;
 this.designation = designation;
 this.address = address;
 }
public void display()
 {
 System.out.println("Employee id : "+empid);
 System.out.println("Name : "+name);
 System.out.println("Designation : "+designation);
 }
}
class manager extends employee
{int salary;
public void calculate()
{
int basic,HRA,DA,PF;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the basic : ");
basic=sc.nextInt();
System.out.println("Enter the HRA : ");
HRA=sc.nextInt();
System.out.println("Enter the DA : ");
DA=sc.nextInt();
System.out.println("Enter the PF : ");
PF=sc.nextInt();
salary = (basic+HRA+DA-PF);
}
 public void display()
  {
   super.display();
   System.out.println("Salary : "+salary);
   System.out.println("Adress :"+address);
  }
}
class worker extends manager
{int salary;
public void calculate()
{
int hrs;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Hours worked : ");
hrs=sc.nextInt();
salary = (hrs*100);
}
 public void display()
  {
   super.display();
   System.out.println("Salary : "+salary);
   System.out.println("Adress :"+address);
  }
}
class superviser extends worker
{int salary;
public void calculate()
{
int hrs,incentive;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Hours worked : ");
hrs=sc.nextInt();
System.out.println("Enter the incentive: ");
incentive=sc.nextInt();
salary = ((hrs*100)+incentive);
}
 public void display()
  {
   super.display();
   System.out.println("Salary : "+salary);
   System.out.println("Adress :"+address);
  }
}
class sal
{
public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the empid : ");
 int empid=sc.nextInt();
 System.out.println("Enter the name : ");
 String name=sc.next();
 System.out.println("Enter the designation  ");
 String designation = sc.next();
 System.out.println("Enter the address : ");
 String address=sc.next();
 if(designation.equals("manager"))
         { manager obj=new manager(empid,name,designation,address);
            obj.calculate();
            obj.display();
         }
 if(designation.equals("manager"))
          {   
            worker obj=new worker(empid,name,designation,address);
            obj.calculate();
            obj.display();
          }
 if(designation.equals("manager"))
          {         
           superviser obj=new superviser(empid,name,designation,address);
            obj.calculate();
            obj.display();
          }
 

 }
}
