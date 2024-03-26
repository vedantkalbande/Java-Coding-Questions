import java.util.Scanner;
public class ReverseAtNumber{

    public static void main(String [] args)
    {
        int revnum=0,ini,num,digit=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number of reverse");
        num = sc.nextInt();
        ini = num;

        while(num!=0)
        {
            digit = num % 10;
            num = num / 10;
            revnum =  revnum * 10 + digit;
        }
        System.out.println("Digit = "+digit+"; Number = "+num+"; revnum =  "+revnum);
    }
  

    
}
