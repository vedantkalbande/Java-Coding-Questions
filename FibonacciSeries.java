/*import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String args[])
    {
        int limit, a=0,b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit  we have to print  the Fibonacci Series:");
        limit = sc.nextInt();

        while(a<=limit)
        {
            System.out.println(" "+a);

            b = a + b;

            a = b - a;
        }

    }
    */

public class FibonacciSeries
 {
   public static void main (String[]args)
   {

     int num = 15;
     int a = 0, b = 1;

    
       System.out.print (a + " , " + b + " , ");

     int nextTerm;

    
     for (int i = 2; i < num; i++)
       {
      nextTerm = a + b;
      a = b;
          b = nextTerm;
          System.out.print (nextTerm + " , ");
       }


   }
 }

