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

    public void InsertLast(int iValue)
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
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newn;
            count++;
        }
    }

    public void InsertAtPos(int iValue,int iPos)
    {
               
        if((iPos<1)||(iPos>count+1))
        {
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(iValue);
        }
        else if(iPos == count+1)
        {
            InsertLast(iValue);
        }
        else
        {
            Node newn = null;
            newn = new Node();
            newn.data = iValue;
            newn.next = null;

            Node temp = head;
            for(int i=1;i<=iPos-2;i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;
            count++;
        }
    }

    public void DeleteFirst()
    {
        if(head == null)
        {
            return;
        }
        else
        {
            head = head.next;
            count--;
        }
    }

    public void DeleteLast()
    {
        if(head == null)
        {
            return;
        }
        else if(head.next == null)
        {
            head = null;
            count--;

        }
        else 
        {
            Node temp = head;
            while(temp.next.next!=null)
            {
                temp = temp.next;
            }
            temp.next = null;
            count--;
        }
    }

    public void DeleteAtPos(int iPos)
    {
        if((iPos<1)||(iPos>count))
        {
          return;
        }
        if(iPos == 1)
        {
             DeleteLast(); 
        }
        else if(iPos == count)
        {
            DeleteLast();
        }
        else
        {
            Node temp = head;
            for(int i=1; i<=iPos-2;i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            count--;
        }
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
}