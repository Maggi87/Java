import java.util.*;
class HashSets
{
    public static void main(String args[])
    {
        HashSet<String> h = new HashSet<String>();

        h.add("Ram");
        h.add("Ram");
        h.add("");      
        h.add("Mauli");
        h.add("Hemant");
       

        System.out.println(h);
    }
}