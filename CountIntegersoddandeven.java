public class CountIntegersoddandeven {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] counts = countEvenOdd(array);
        
        System.out.println("Number of even integers: " + counts[0]);
        System.out.println("Number of odd integers: " + counts[1]);
    }
    
    public static int[] countEvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        int[] counts = {evenCount, oddCount};
        return counts;
    }
}
