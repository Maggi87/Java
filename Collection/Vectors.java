import java.util.*;
import java.lang.*;
class Vectors
{
    public static void main(String args[])
    {
        Vector<String> v = new Vector<String>();

        v.add("Mauli");       
        v.add("Ram");
        v.add("Mai");
        v.add("Hemant");
        v.add("Mai");
        v.add("Hemant");
        v.add("Mai");
        v.add("Hemant");
        v.add("Mai");
        v.add("Hemant");

        System.out.println("Capacity :-"+v.capacity());

        v.add(3,"Dattaprasad");
        System.out.println(v);

          System.out.println("Capacity :-"+v.capacity());

        v.set(3,"Ramprasad");
        System.out.println(v);

        v.remove(4);
        System.out.println(v);

        ListIterator li = v.listIterator();
        while(li.hasPrevious())
        {
            System.out.println(li.previous());
        }

         while(li.hasPrevious())
        {
            System.out.println(li.previous());
        }
    }
}