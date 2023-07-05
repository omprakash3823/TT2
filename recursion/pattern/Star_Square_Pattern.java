package TT2.recursion.pattern;

public class Star_Square_Pattern {
    static void print_Row(int no_of_row_star){
        if(no_of_row_star==0) {
            return;
        }
        System.out.print("*");
        print_Row(no_of_row_star-1);
    }
    static void Star_Square(int row,int column){
        if(column==0){
            return;
        }
        print_Row(row);
        System.out.println();
        Star_Square(row,column-1);
    }
    public static void main(String[] args) {
        Star_Square(5,5);
    }
}
