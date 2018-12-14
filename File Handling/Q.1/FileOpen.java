import java.util.*;
import java.io.*;

/*1. Write java program to accept file name from user and open that file.*/ 

public class FileOpen
{    public static void main(String arg[])
    {
        String fname ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name to open : \t");
        fname = sc.nextLine();

        String line = null;

        try
        {
            FileReader filereader = new FileReader(fname);

            BufferedReader br = new BufferedReader(filereader);

            while((line = br.readLine()) !=  null)
            {
                System.out.println(line);
            }

            br.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
}