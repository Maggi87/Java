/* Accept String from user and return lenght of large word */

import java.lang.*;
import java.util.*;
import java.io.*;

class LWord
{
    public void Largwords(String str)
    {
        int index = -1;

        String arr[] = str.trim().split("\\s+");
        int iMax = 0;

        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i].length() > iMax)
            {
                iMax = arr[i].length();
                index = 1;
            }
        }

        if(index!=-1)
        {
            System.out.println("Length of large word is: "+iMax);
        }
    }
}

class LenghtLargesWord
{
    public static void main(String args[])
    {
        LWord obj = new LWord();
        String str = "India is my country";
        obj.Largwords(str);
    }
}