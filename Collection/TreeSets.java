import java.util.*;
class TreeSets 
{
    public static void main(String args[])
    {
        TreeSet<String> ll = new TreeSet<String>();

        ll.add("Mauli");
        ll.add("Ram");
        ll.add("Nilesh");
        ll.add("Hemant");

        ll.forEach(x -> System.out.println(x));

        TreeSet t1 = new TreeSet();
        t1 = (TreeSet)ll.clone();
        System.out.println(t1);

        System.out.println("frist :- "+ll.first());
        System.out.println("last :- "+ll.last());

        TreeSet<String> ll2 = new TreeSet<String>();
        ll2 = (TreeSet<String>)ll.subSet("Mauli", "Ram");
        //ll2 = (TreeSet<String>)ll.tailSet("Mauli");
        //ll2 = (TreeSet<String>)ll.headSet("Mauli");

        ll2.forEach(y -> System.out.println(y));

    }
}