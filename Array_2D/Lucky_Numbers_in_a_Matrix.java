package TT2.Array_2D;

import java.util.ArrayList;
import java.util.List;

public class Lucky_Numbers_in_a_Matrix {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> minRow = new ArrayList<>();
        List<Integer> maxCol = new ArrayList<>();
        List<Integer> Result = new ArrayList<>();
        int minRowE = Integer.MAX_VALUE;
        int maxColE = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minRowE) {
                    minRowE = matrix[i][j];
                }
            }
            minRow.add(minRowE);
            minRowE = Integer.MAX_VALUE;
        }
        System.out.println(minRow);
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > maxColE) {
                    maxColE = matrix[j][i];
                }
            }
            maxCol.add(maxColE);
            maxColE = Integer.MIN_VALUE;
        }
        for (int e : minRow) {
            if (maxCol.contains(e)) {
                Result.add(e);
            }
        }
        System.out.println(maxCol);
        return Result;

    }

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 10, 4, 2},
                {9, 3, 8, 7},
                {15, 16, 17, 12}};
        List<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans);
    }
}
