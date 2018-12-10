
import java.io.*;
import java.util.*;

class MyArray
{
    public int ArraySum(int arr[])
    {
        int sum = 0, i = 0;
        for(i = 0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }

    public int ArrayMax(int arr[])
    {
        int i = 0, iMax = 0;
        iMax = arr[0];

        for(i = 0; i<arr.length;i++)
        {
            if(arr[i]>iMax)
            {
                iMax = arr[i];
            }
        } 
        return iMax;       
    }

    public int ArrayMin(int arr[])
    {
        int i = 0, iMin = 0;
        iMin = arr[0];

        for(i = 0; i<arr.length;i++)
        {
            if(arr[i]<iMin)
            {
                iMin = arr[i];
            }
        } 
        return iMin;       
    }

    public void SummentionEachDigit(int arr[],int iSize)
    {
        int sum = 0, i = 0, iDigit = 0, temp = 0;

        for(i=0; i<iSize; i++)
        {
            sum = 0;
            temp  = arr[i];

            while(temp!=0)
            {
                iDigit = temp % 10;
                sum = sum + iDigit;
                temp = temp / 10;
            }
            System.out.println(sum);
        } 
    }

    public void ReturnArray(int arr[])
    {
        int i = 0;
        for(i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}

class Array
{
    public static void main(String arg[])
    {
        int iRet = 0;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int size = obj.nextInt();
        int Arr[]  = new int[size];

        System.out.println("Enter the array element");
        for(int i = 0; i<Arr.length;i++)
        {
            Arr[i] = obj.nextInt();
        }

        System.out.println("Element Are");
        for(int i = 0; i<Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }

        MyArray mObj = new MyArray();

        iRet = mObj.ArraySum(Arr);
        System.out.println("Summention of Array :-\t"+iRet);

        iRet = mObj.ArrayMax(Arr);
        System.out.println("Maximin Number of Array :-\t"+iRet);

        iRet = mObj.ArrayMin(Arr);
        System.out.println("Minimin Number of Array :-\t"+iRet);

        mObj.SummentionEachDigit(Arr,size);

        mObj.ReturnArray(Arr);
    }
}