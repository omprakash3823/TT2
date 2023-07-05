package TT2.recursion.medium_level;

import java.util.ArrayList;

public class Diagonal_Maze_problem {
    static ArrayList<String> Maze_Problem(int row, int col, int curr_row, int cur_col) {

        if (row == curr_row && col == cur_col) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("");
            return arrayList;
        }
        if (row < curr_row || col < cur_col) {
            return new ArrayList<>();
        }
        ArrayList<String> Str = new ArrayList<>();
        ArrayList<String> Horizontal = Maze_Problem(row, col, curr_row, cur_col + 1);
        for (String temp : Horizontal) {
            Str.add("H" + temp);
        }
        ArrayList<String> Vertical = Maze_Problem(row, col, curr_row + 1, cur_col);
        for (String temp : Vertical) {
            Str.add("V" + temp);
        }
        ArrayList<String> Diagonal = Maze_Problem(row, col, curr_row + 1, cur_col + 1);
        for (String temp : Diagonal) {
            Str.add("D" + temp);
        }
        return Str;
    }

    public static void main(String[] args) {
        int row = 2;
        int col = 2;
        ArrayList<String> result = Maze_Problem(row, col, 0, 0);
        System.out.println(result);
    }
}
