package TT2.recursion.pattern;

public class Hollow_Square_pattern {
    static void print_Star(int no_o_star, int column) {
        if (no_o_star == 0) {
            return;
        }
        if (no_o_star == 1 || no_o_star == 5 || column == 1 || column == 5) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
        print_Star(no_o_star - 1, column);

    }

    static void hollow_star(int row, int column) {
        if (column == 0) {
            return;
        }
        print_Star(row, column);
        System.out.println();
        hollow_star(row, column - 1);
    }

    public static void main(String[] args) {
        hollow_star(5, 5);
    }
}
