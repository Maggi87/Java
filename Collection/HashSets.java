import java.util.*;
import java.util.stream.*; 
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

        HashSet h1 = new HashSet();
        h1 = (HashSet)h.clone();

        System.out.println(h1);

        h1.remove("Mauli");
        System.out.println(h1);

        h.forEach(p -> System.out.println(p));

        System.out.println(h.isEmpty());

        h.clear();

    }
}