package TT2.recursion.pattern;

public class pattern_5 {

    static void print_row(int currrow,int x){
        if(currrow==0){
            return;
        }

        System.out.print(x+" ");
        print_row(currrow-1,x+1);
    }
    static void pattern_123(int row , int currrow ,int x){
        if(row==0){
            return;
        }
        print_row(currrow,x);
        System.out.println();
        pattern_123(row-1,currrow+1,x+currrow);
    }
    public static void main(String[] args) {
      pattern_123(4,1,1);
    }
}
