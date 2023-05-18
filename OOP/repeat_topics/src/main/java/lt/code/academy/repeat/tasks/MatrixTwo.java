package lt.code.academy.repeat.tasks;

public class MatrixTwo {
    public static void main(String[] args) {
        int[][] matrix = {{12, 5, -9}, {8, -7, 16}, {7, -8, 5}};

        MatrixTwo two = new MatrixTwo();
        System.out.println(two.moreThanFive(matrix));
    }
    private int moreThanFive (int [] [] matrix) {

        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 5; col < matrix[row].length; col++) {
                if (matrix[row][col] > 5) {
                    sum += matrix[row] [col];
                }
            }
        }
        return sum;
    }

}
