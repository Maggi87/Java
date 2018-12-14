import java.util.*;
import java.io.*;

/*3. Write java program to accept file name from user and open that file in write mode and write some
data at the end of file.*/ 

public class FileRead
{
    public static void main(String arg[]) throws IOException
    {
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try
        {
            fw = new FileWriter("demo.txt",true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            pw.println("Hell New File");
            System.out.println("Data Successfully into file");
            pw.flush();
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            pw.close();
            bw.close();
            fw.close();
        }
    }
}