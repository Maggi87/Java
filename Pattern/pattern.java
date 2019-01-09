import java.util.*;
class patterns
{
    int i = 0, k = 0, j = 0, l = 0;
    /*
              *
            * * *
          * * * * *
        * * * * * * *
    */
    public void patterns1(int row)
    {
        for(i = 1; i <= row; i++)
        {
            for(k = 1; k <= row-i; k++)
            {
                System.out.print("  ");
            }

            for(j = 1;j <= (i*2)-1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 

    /*
         1
        123
       12345
      1234567
    */

    public void patterns2(int row)
    {
        for(i = 1; i <= row; i++)
        {
            for(k = 1; k <= row-i; k++)
            {
                System.out.print(" ");
            }
            for(j = 1; j <= (i*2)-1; j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    /*
               1
              222
             33333
            4444444
    */
    public void patterns3(int row)
    {
        for(i = 1; i <= row; i++)
        {
            for(k = 1; k <= row-i; k++)
            {
                System.out.print(" ");
            }
            for(j = 1; j <= (i*2)-1; j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    /*
            * * * * * * *
              * * * * *
                * * *
                  *
    
    */
    public void patterns4(int row)
    {
        for(i =1; i<=row ;i++)
        {
            for(k = 1; k <=i; k++)
            {
                System.out.print("  ");
            }

            for(j =1; j <= ((row-i+1)*2)-1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
                4444444
                 33333
                  222
                   1
                  222
                 33333
                4444444   
    */
    void patterns5(int row)
    {
        for(i = row; i >= 1; i--)
        {
            for(j = 1; j <= row-i; j++)
            {
                System.out.print(" ");
            }
            for(k = 1; k <= (i*2)-1; k++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        for(i = 2; i <= row; i++)
        {
            for(j = 1; j <= row-i; j++)
            {
                System.out.print(" ");
            }

            for(k = 1; k <= (i*2)-1; k++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /*
            H
            He
            Hel
            Hell
            Hello

            D
            De
            Dem
            Demo

            a
            ab
            abc    
    */

    public void patterns6(String str)
    {
        String arr[] = str.trim().split("//s");
        
        for(i = 0; i<arr.length; i++)
        {
            for(j = 0; j < arr[i].length(); j++)
            {
                for(k = 0; k <= j ; k++)
                {
                    System.out.print(arr[i].charAt(k));
                }
                System.out.println();
            }  
            System.out.println();
            
        }
    }

    /*
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
     1 2 3 4
      1 2 3
       1 2
        1
    
    */

    public void patterns7(int row)
    {
        for(i = 1; i < row; i++)
        {
            for(k = 1; k < row-i; k++)
            {
                System.out.print(" ");
            }
            for(j = 1; j < (i); j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        for(i = row-2; i > 1; i--)
        {
            for(k = 1; k < row-i; k++)
            {
                System.out.print(" ");
            }
            for(j = 1; j < (i); j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    /*
                     *
                    * *
                   * * *
                  * * * *
                 * * * * *
                * * * * * *
               * * * * * * *    
    */
    public void patterns8(int row)
    {
        for(i = 1; i <= row; i++)
        {
            for( k = 1; k <= row-i; k++)
            {
                System.out.print(" ");
            }

            for(j = 1; j < (i) ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
                        1 2 3 4 5
                         2 3 4 5
                          3 4 5
                           4 5
                            5
                           4 5
                          3 4 5
                         2 3 4 5
                        1 2 3 4 5
    */
    public void patterns9(int row)
    {
        for(i = row ; i >= 1; i--)
        {
            for(j = 1; j <= row-i ; j++)
            {
                System.out.print(" ");
            }
            for(k = (row-i+1); k <= row ; k++)
            {
                System.out.print(" "+k);
            }          
            System.out.println();
        }

        for(i=2; i <= row; i++)
        {
            for(k=1; k <= row-i; k++)
            {
                System.out.print(" ");
            }

            for(j = (row-i)+1 ; j <= row; j++)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }

    /*
                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
                1 2 3 4
                1 2 3
                1 2
                1
    */
    public void patterns10(int row)
    {
        for(i = 1; i<=row; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(i = row-1; i>=1; i--)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /*
            1
           212
          32123
         4321234
        543212345
    
    */
    public void patterns11(int row)
    {
        for(i = 1; i<=row; i++)
        {
            for(k=1; k<=row-i;k++)
            {
                System.out.print(" ");
            }
            for(j=i; j>=1; j--)
            {
                System.out.print(j);
            }
            for(l=2;l<=i;l++)
            {
                System.out.print(l);
            }            
            System.out.println();
        }        
    }
}

class pattern
{
    public static void main(String args[])
    {
        patterns p = new patterns();
        p.patterns1(4);
        p.patterns2(4);
        p.patterns3(4);
        p.patterns4(4);
        p.patterns5(4);
        

        String str = "Hello Demo abc";
        p.patterns6(str);

        p.patterns7(7);
        p.patterns8(8);
        p.patterns9(5);
        p.patterns10(5);
        p.patterns11(5);
        
    }
}