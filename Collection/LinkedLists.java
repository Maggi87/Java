import java.util.*;
import java.lang.*;
class LinkedLists
{
	public static void main(String args[])
	{
        LinkedList<Integer> ll = new LinkedList<Integer>();

        for(int i=1;i<5;i++){
            ll.add(i);
        }

        System.out.println(ll);

        ll.addFirst(10);
        System.out.println(ll);

        ll.addLast(20);
        System.out.println(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        ll.set(3,100);
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);

        System.out.println(ll.size());

        ListIterator it = ll.listIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        while(it.hasPrevious())
        {
            System.out.println(it.previous());
        }
    }
}