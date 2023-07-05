package TT2.recursion.pattern;

public class Mirror_Left_Pattern {

    static void print_star(int no_of_star) {
        if (no_of_star == 0) {
            return;
        }
        System.out.print(" ");
        print_star(no_of_star - 1);
    }

    static void printstar(int noofstar) {
        if (noofstar == 0) {
            return;
        }
        System.out.print("*");
        printstar(noofstar - 1);
    }

    static void mirror_pattern_1(int row, int column) {
        if (column == 6) {
            return;
        }
        print_star(row);
        printstar(column);
        System.out.println();

        mirror_pattern_1(row - 1, column + 1);
    }

    public static void main(String[] args) {
        mirror_pattern_1(4, 1);

    }
}
