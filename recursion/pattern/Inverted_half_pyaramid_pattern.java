package TT2.recursion.pattern;

public class Inverted_half_pyaramid_pattern {
    static void printstar(int noofstar){
        if(noofstar==0){
            return;
        }
        System.out.print("*");
        printstar(noofstar-1);
    }
    static void pattern(int row ,int current_row){
        if(row==0){
            return;
        }
        printstar(current_row);
        System.out.println();
        pattern(row-1,current_row-1);
    }
    public static void main(String[] args) {
        pattern(5,5);

    }
}
