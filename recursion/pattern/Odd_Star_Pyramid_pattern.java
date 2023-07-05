package TT2.recursion.pattern;

public class Odd_Star_Pyramid_pattern {
    static void printspace(int no_of_space){
        if(no_of_space==0){
            return;
        }
        System.out.print(" ");
        printspace(no_of_space-1);
    }
    static void printstar(int no_of_star){
        if(no_of_star==0){
            return;
        }
        System.out.print("*");
        printstar(no_of_star-1);
    }
    static void pattern(int row ,int current_row,int space){
        if(row==0){
            return;
        }
        printspace(space);
        printstar(current_row);
        System.out.println();
        pattern(row-1,current_row+2,space-1);
    }
    public static void main(String[] args) {
        pattern(5,1,5);

    }
}
