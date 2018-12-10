
import java.io.*;
import java.util.*;

class Char 
{
    public int CharCount(String str)
    {
        int iCnt = 0;
        for(int i = 0; i <str.length(); i++)
        {
            if((str.charAt(i)>='A') && (str.charAt(i) <= 'Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class StringChar
{
    public static void main(String arg[])
    {
        
        Scanner obj = new Scanner(System.in);
        String str = null;

        System.out.println("Enter the String");
        str = obj.nextLine();

        Char cObj = new Char();

        int iRet = 0;
        iRet = cObj.CharCount(str);
        System.out.println("Number of Capatil Character is"+iRet);
    }
}