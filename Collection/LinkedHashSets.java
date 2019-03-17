import java.util.*;
class LinkedHashSets 
{
    public static void main(String args[])
    {
        LinkedHashSet<String> ll = new LinkedHashSet<String>();

        ll.add("Mauli");
        ll.add("Ram");
        ll.add("Nilesh");
        ll.add("Hemant");

        ll.forEach(x -> System.out.println(x));

        System.out.println(ll.contains("Mauli"));

        LinkedHashSet ll1 = new LinkedHashSet();
        ll1 = (LinkedHashSet)ll.clone();
        System.out.println(ll1);

        System.out.println(ll.contains("Mauli"));

        LinkedHashSet ll2 = new LinkedHashSet();
        ll2 = (LinkedHashSet)ll.clone();

        System.out.println(ll2);

        ll.remove("Hemant");
        System.out.println(ll);

    }
}