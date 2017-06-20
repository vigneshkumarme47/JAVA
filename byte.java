import java.io.FileOutputStream;
class output
 {
 public static void main(String args[])
 {
  try 
  { 
   FileOutputStream fout = new FileOutputStream("testout.txt");
   String s="Welcome to javaTpoint";
    byte b[] = s.getBytes();//converting string into byte array
    fout.write(b);
     fout.close();
   System.out.println("success");
   fout.close();
   }catch(Exception e){   System.out.println(e);}
  
 }
}
