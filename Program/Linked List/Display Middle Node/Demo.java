import MarvellousCollection.LinkedList;
import MarvellousCollection.Node;
public class Demo
{
    public static void main(String arg[])
    {
        LinkedList obj = new LinkedList();
        System.out.println("/n-----------------------Insert First-----------------------/n");
        obj.InsertFirst(11);
        obj.InsertFirst(21);
        obj.InsertFirst(31);
        obj.InsertFirst(41);
       
        obj.Display();
        obj.MiddleNode();
        
        System.out.println("Number of Count"+obj.count);
        
    }
}

/*
    javac -d . Node.java
    javac LinkedList.java
    javac Demo.java 
    java Demo.java
 */