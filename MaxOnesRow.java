public class MaxOnesRow {
    public static int rowWithMaxOnes(int[][] matrix) {
        int maxOnesRow = -1;
        int maxOnesCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxOnesCount) {
                maxOnesCount = count;
                maxOnesRow = i;
            }
        }

        return maxOnesRow;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}
        };
        System.out.println("Row with maximum number of 1's: " + rowWithMaxOnes(matrix));
    }
}
