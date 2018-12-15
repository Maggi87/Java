package MarvellousCollection;
import java.util.*;

public class LinkedList
{
    public Node head = null;
    public int count = 0;

    public void InsertFirst(int iValue)
    {
        Node newn = null;
        newn = new Node();

        newn.data = iValue;
        newn.next = null;

        if(head == null)
        {
            head = newn;
        }
        else
        {
            newn.next = head;
            head = newn;
        }
        count++;
    }

    

    public void Display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }    

    public void MiddleNode()
    {
        Node first = head;
        Node second = head;
        while((first!=null)&&(first.next!=null))
        {
            first = first.next.next;
            second = second.next;
        }
        System.out.println("Middle Node is"+second.data);
    }    
}