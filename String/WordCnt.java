/* Accept string from user and count number of word of that string.
That string contains multiple white spaces in beetween to word */
import java.lang.*;
import java.util.*;
import java.io.*;

class MyString
{
    public int WordCount(String str)
    {
         
        String arr[] = str.split(" ");
        int iRet = arr.length;
        return iRet;
    }
}
class WordCnt
{   public static void main(String args[])
    {
        MyString obj = new MyString();
        
        int iRet = obj.WordCount("dwed dwed wedwed wed");
        System.out.println("Number of Word in String :- "+iRet);

    }
}