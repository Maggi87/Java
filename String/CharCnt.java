/*Accept String from user accept one character count number of that character from the string */
import java.io.*;
import java.util.*;
import java.lang.*;

class MyString
{
    public int CharCount(String ch, String strs)
    {
        String temp = strs.replaceAll(ch,"");
        int iRet = 0;
        iRet = strs.length() - temp.length();
        return iRet;
    }
}

class CharCnt
{
    public static void main(String args[])
    {
        MyString obj = new MyString();
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the String");
        String str = sc.next();

        System.out.println("Enter the character");
        String ch = sc.next();

        int iRet = obj.CharCount(ch,str);
        System.out.println("Number of character is word :- "+iRet);

    }
}