import java.io.FileOutputStream;
class output
 { 
   public static void main(String args[])
 {  
    try   
{   
   FileOutputStream fout = new FileOutputStream("testout.txt");
   String s="welcome";   
   byte b[] = s.getBytes();//converting string into byte array
   for(int i=0;i<100;i++)    
   {
    switch(b[i])
    {
  case 'a' : System.out.println("a");break;
  case 'e' : System.out.println("e");break;
  case 'i' : System.out.println("i");break;
  case 'o' : System.out.println("o");break;
  case 'u' : System.out.println("u");break;
    }
}
   fout.close();   
  
  }catch(Exception e){   System.out.println(e);}
 }
}
