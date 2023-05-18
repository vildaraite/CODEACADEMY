package lt.code.academy.repeat.tasks;



public class MatrixOne {
    public static void main(String[] args) {

        //int[][] matrix = new int [4][3];
        //matrix[0][0] = 1;

        int[][] matrix = {{5, 8, -9}, {8, -7, 9}, {7, -8, 5}};
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > 0) {
                    count++;
                }
            }
            System.out.println();
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }


    }
}
