import java.io.FileInputStream;
class input
 {
 public static void main(String args[])
 {
  try 
  { 
   FileInputStream fin = new FileInputStream("testout.txt");
   int i =fin.read();
   System.out.println((char)i);
   fin.close();
  }catch(Exception e){   System.out.println(e);}
 }
}
