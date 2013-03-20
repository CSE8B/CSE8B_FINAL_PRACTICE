//this is an program that will create a file and put some written text into it.
import java.io.*;

public class WriteData
{
  public static void main(String[]args) throws IOException
  {
    File file = new File ("girls");
    if(file.exists())
    {
      System.out.println("File already exists");
      System.exit(1);
    }

    PrintWriter output = new PrintWriter(file);

    output.println("Hello world");
    output.println("Hello Earth");
    output.println("Hello Sun");
    output.println("Hello Moon");
    
    output.close();
  }
}
