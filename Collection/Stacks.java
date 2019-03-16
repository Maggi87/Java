import java.util.*;
class Stacks
{
    public static void main(String args[])
    {
        Stack<String> ss = new Stack<String>();

        ss.push("Amar");
        ss.push("Pramod");
        ss.push("Gaurav");
        ss.push("Vijay");
        ss.push("Ankush");

        int p = 0;
        p = ss.search("Vijay");
        if(p == -1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Element Found at :-"+p);
        }

        System.out.println(ss.pop());

        System.out.println(ss.peek());

        System.out.println(ss);
    }
}