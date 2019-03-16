import java.util.*;
import java.lang.*;

class ArrayLists
{
	public static void main(String args[])
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(2);

		System.out.println(ar);

		ar.add(3, 5);
		System.out.println(ar);

		ar.set(2,10);	
		System.out.println(ar);
		
		ar.remove(3);
		System.out.println(ar);

		System.out.println(ar.indexOf(2));

		System.out.println(ar.lastIndexOf(2));

        Iterator it = ar.iterator();
        while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
