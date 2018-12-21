/* Accept String from user which contain speacial character we haave return in which all special 
   character should be wright side after non special character */
import java.io.*;
import java.lang.*;
import java.util.*;

class Charcters
{
    public String specialchar(String str)
    {
        String arr = "[a-zA-Z0-1]";

        String first = "";
        String second = "";
        char ch;

        for(int i = 0; i<str.length();i++)
        {
            ch = str.charAt(i);
            if(str.valueOf(ch).matches(arr))
            {
                first = first + ch;
            }
            else
            {
                second = second + ch;
            }
        }
        return first+second;
    }
}

class LastSpecialChar
{
    public static void main(String args[])
    {
        Charcters obj = new Charcters();
        String str = "Hello@gmail.com#";

        String sRet = obj.specialchar(str);
        System.out.println("String is: "+sRet);
    }
}