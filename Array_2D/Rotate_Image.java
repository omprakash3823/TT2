package TT2.Array_2D;

import java.util.List;

public class Rotate_Image {
    public static void rotate(int[][] matrix) {
        for(int i=0;i<matrix[0].length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=0;
                temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        // step 2 - Reverse each row of matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length/2;j++){
                int temp= matrix[i][j];
                matrix[i][j]= matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]= temp;

            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(" "+matrix[i][j]);

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 10, 4, 2},
                {9, 3, 8, 7},
                {15, 16, 17, 12}};
           rotate(matrix);

    }
}
