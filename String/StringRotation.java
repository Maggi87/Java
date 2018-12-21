/* Accept 2 string from user and check whether first string rotation of 2nd string or not
   . it is not allowed to change content of any string. rottinal of the string should be 100% */
import java.lang.*;
import java.util.*;
import java.io.*;

class RotationStr
{
    public boolean ChkStrRotation(String str1, String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }

        String str3 = str1 + str2;
        boolean iRet;

        iRet = str3.contains(str2);

        return iRet;
    }
}

class StringRotation
{
    public static void main(String arg[])
    {
        RotationStr obj = new RotationStr();

        String str1 = "abcd";
        String str2 = "cdab";

        boolean iRet = obj.ChkStrRotation(str1,str2);
        if(iRet == true)
        {
            System.out.println("String is Rotational");
        }
        else
        {
            System.out.println("String is Not Rotational");
        }
    }
}