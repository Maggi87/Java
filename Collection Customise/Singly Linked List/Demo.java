import MarvellousCollection.LinkedList;
import MarvellousCollection.Node;
class Demo
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
        
        System.out.println("/n-----------------------Insert Last-----------------------/n");
        obj.InsertLast(51);
        obj.Display();

        System.out.println("/n-----------------------Insert At Pos-----------------------/n");
        obj.InsertAtPos(551,4);
        obj.Display();    

        System.out.println("/n-----------------------Delete At Pos-----------------------/n");
        obj.DeleteAtPos(4);
        obj.Display();        
              
        System.out.println("/n-----------------------Delete First----------------------/n");
        obj.DeleteFirst();
        obj.Display();
       
        System.out.println("/n-----------------------Delete Last------------------------/n");
        obj.DeleteLast();
        obj.Display();

        System.out.println("Number of Count"+obj.count);
        
    }
}