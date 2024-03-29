import java.util.Scanner;
public class Palindrome {

    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number to check it is a palindrome");
        int num  = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println(num + " is  a palindrome");
        }
         else{
            System.out.println(num + "is not a palindrome");
         }
        }

        public static boolean isPalindrome(int num){
            int originalNumber = num;
            int reverse = 0;

            while(num!=0){
                int remainder = num%10;
                reverse = reverse * 10 + remainder;
                num/=10;
            }
            return originalNumber == reverse;


        
        }
     }
    

