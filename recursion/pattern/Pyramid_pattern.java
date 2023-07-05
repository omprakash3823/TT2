package TT2.recursion.pattern;

public class Pyramid_pattern {
    static void printspace(int noofspace){
        if(noofspace==0){
            return;
        }
        System.out.print(" ");
        printspace(noofspace-1);
    }
    static void printstar(int noofstar){
        if(noofstar==0){
            return;
        }
        System.out.print("* ");
        printstar(noofstar-1);
    }
    static void pattern(int row ,int current_row,int space){
        if(row==0){
            return;
        }
        printspace(space);
        printstar(current_row);
        System.out.println();
        pattern(row-1,current_row+1,space-1);
    }
    public static void main(String[] args) {
        pattern(5,1,5);

    }
}
