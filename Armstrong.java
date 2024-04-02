public class Armstrong{
public static boolean isArmstrong(int num) {
    int originalNumber, remainder, result = 0, n = 0;
    originalNumber = num;
    for (;originalNumber != 0; originalNumber /= 10, ++n);
    originalNumber = num;
    for (;originalNumber != 0; originalNumber /= 10) {
        remainder = originalNumber % 10;
        result += Math.pow(remainder, n);
    }
    return result == num;
}

public static void main(String[] args) {
    int num = 223;
    System.out.println("Is " + num + " an Armstrong number? " + isArmstrong(num));
}
}