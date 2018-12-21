/* Accept String From user and return such a string which contains every word in reverse format */
import java.io.*;
import java.lang.*;
import java.util.*;


class RevWords
{
    public String WordRev(String str)
    {
        String arr[] = str.trim().split("\\s+");
        StringBuffer fbuffer = new StringBuffer(arr.length + 1);

        StringBuffer temp =null;

        for(int i = 0; i<arr.length; i++)
        {
            temp = new StringBuffer(arr[i]);
            fbuffer.append(temp.reverse().append(" "));
            temp = null;
        }
        return fbuffer.toString().trim();
    }

}
class RevWord
{
    public static void main(String args[])
    {
        {
            RevWords obj = new RevWords();
            
            String sRet = obj.WordRev("abc lmo opq xyz");
            System.out.println("Reverse String : "+sRet);
        }
    }
}