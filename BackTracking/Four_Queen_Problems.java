package TT2.BackTracking;

public class Four_Queen_Problems {
    static int count_ways(boolean[][] board, int curr_row) {
        int count = 0;

        // add base case to check
        if (curr_row == board.length) {
            return 1;
        }

        //traverse all columns of board
        for (int col = 0; col < board[curr_row].length; col++) {
            //check if queen is safe to place
            if (isSafe(board, curr_row, col)) {
                //place the queen on board
                board[curr_row][col] = true;
                //move to the next row once a queen is place in current row
                count += count_ways(board, curr_row + 1);
                board[curr_row][col]=false;
            }

        }
        return count;
    }

    static boolean isSafe(boolean board[][], int row, int col) {
        for (int i = row; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j< board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        boolean[][] board = new boolean[4][4];
        int res = count_ways(board, 0);
        System.out.println(res);
    }
}

