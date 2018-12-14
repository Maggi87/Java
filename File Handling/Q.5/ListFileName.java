

import java.util.*;
import java.io.*;

public class ListFileName
{
    public static void main(String arg[])
    {
        String dirPath = "C:/Users/OPM 013/Desktop/file handling";

        File dir = new File(dirPath);
        String[] files = dir.list();
        if (files.length == 0)
        {
            System.out.println("The directory is empty");
        } 
        else 
        {
            for (String aFile : files) 
            {
                System.out.println(aFile);
            }
        }
    }
}