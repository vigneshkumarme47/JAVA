import java.io.*;
interface example
{
int num=90;
public abstract void disp();
public abstract void display();
}
class example1 implements example
{
public void display()
{
System.out.println("display in example1");
}
public void disp()
{int num=900;
System.out.println(num);
}

}
class demo
{
public static void main(String args[])
{
example1 obj=new example1();
obj.display();
obj.disp();
}
}
