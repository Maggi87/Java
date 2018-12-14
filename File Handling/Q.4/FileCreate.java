/*4. Write java program to accept file name from user and create new file of that name if it is not
existing.*/

import java.util.*;
import java.io.*;

public class FileCreate
{
    public static void main(String arg[])
    {
        String fname ;
        Scanner sc = new Scanner(System.in);
        boolean create = false;

        System.out.println("Enter the file name to open : \t");
        fname = sc.nextLine();
        try
        {
            File f = new File(fname);
            if(f.exists())
            {
                System.out.println("File Already Exist");
            }
            else
            {
                System.out.println("No such file create now");
                create = f.createNewFile();
                if(create == true)
                {
                    System.out.printf("Successfully created new file: %s%n", f);
                }
                else
                {
                    System.out.printf("Failed to create new file: %s%n", f);
                }
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }       
    }
}