import java.util.*;
import java.util.stream.*; 

class ArrayWithVector {
    public static void main(String args[])
    {
        try
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(12);
            arr.add(13);
            arr.add(14);
            arr.add(15);

            Vector<Integer> v = new Vector<Integer>();
            v.addAll(arr);
               
            System.out.println(v);

            System.out.println(arr.isEmpty());

            List<Integer> list = arr.stream().map(X -> X).collect(Collectors.toList());
            System.out.println(list);

        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}