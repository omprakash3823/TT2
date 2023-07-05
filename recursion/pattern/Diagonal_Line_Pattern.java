package TT2.recursion.pattern;

public class Diagonal_Line_Pattern {
    static void print_star(int no_of_star) {
        if (no_of_star == 0) {
            return;
        }
        System.out.print("*");
        print_star(no_of_star - 1);
    }

    static void print_space(int no_of_space) {
        if (no_of_space == 0) {
            return;
        }
        System.out.print(" ");
        print_space(no_of_space - 1);
    }

    static void diadonal_line(int row, int col) {
        if (row == 0) {
            return;
        }
        print_space(row - 1);
        print_star(col);
        System.out.println();
        diadonal_line(row - 1, col);

    }

    public static void main(String[] args) {
        diadonal_line(6, 1);

    }
}
// ----*
// ---*_
// --*--
// -*---
// *----