/* Accept a string from user and display frequency of each word from that string */
import java.io.*;
import java.util.*;
import java.lang.*;

class Frequency
{
    public void maxFrequency(String str)
    {
        String arr[] = str.trim().split("\\s+");
        
        HashMap<String, Integer> hobj = new HashMap<String, Integer>();
        
        for(String element: arr)
        {
            if(hobj.containsKey(element))
            {
                hobj.put(element, hobj.get(element)+1);
            }
            else
            {
                hobj.put(element, 1);
            }
        }

        Set<String> sobj = hobj.keySet();
        int iMax = 0;
        String maxStr = null;

        for(String element: sobj)
        {
            if(iMax < hobj.get(element))
            {
                iMax = hobj.get(element);
                maxStr = element;
            }
        }

        System.out.println("Maximum occured word :- "+maxStr);
        System.out.println("Its Frequency :- "+iMax);
    }
} 

class FrequencyOfWord
{
    public static void main(String args[])
    {
        Frequency obj = new Frequency();
        String str = "abc pqr abc pqr abc ijk abc";
        obj.maxFrequency(str);
    }
}