package TT2.recursion.without_Arraylist;

import java.util.ArrayList;

public class Diagonal_Maze_problem {

    static void Maze_Problem(int row, int col, int curr_row, int cur_col,String out) {

        if (row == curr_row && col == cur_col) {
            System.out.print(out+" ");
            return;
        }
        if (row < curr_row || col < cur_col) {
            return;
        }

        Maze_Problem(row, col, curr_row, cur_col + 1,out+"H");
        Maze_Problem(row, col, curr_row + 1, cur_col,out+"V");
        Maze_Problem(row, col, curr_row + 1, cur_col + 1,out+"D");

        return ;
    }

    public static void main(String[] args) {
        int row = 2;
        int col = 2;
        String output="";
        System.out.print("[ ");
        Maze_Problem(row, col, 0, 0,output);
        System.out.println("]");
    }
}
