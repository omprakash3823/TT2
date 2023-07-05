package TT2.recursion.pattern;

public class pattern_6 {
    static void print_row(int currrow,int a){
        if(currrow==0){
            return;
        }

        System.out.print((char) (a));
        print_row(currrow-1,a);
    }
    static void pattern_123(int row , int currrow ,int a){
        if(row==0){
            return;
        }
        print_row(currrow,a);
        System.out.println();
        pattern_123(row-1,currrow+1,a+1);
    }
    public static void main(String[] args) {
        int a = 65;
        pattern_123(5,1,a);

    }
}
