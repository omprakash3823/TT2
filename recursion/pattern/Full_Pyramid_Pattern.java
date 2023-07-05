package TT2.recursion.pattern;

public class Full_Pyramid_Pattern {
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
    static void pattern(int row ,int current_row,int i) {
        if (row == 0) {
            return;
        }
        printspace(row-1);
        printstar(current_row*2+1);
        System.out.println();
        pattern(row-1,current_row+1,i);

        if(row==i){
            return;
        }
       printspace(row);

       printstar(current_row*2-1);
        System.out.println();

    }
    public static void main(String[] args) {
        int row=6;
        int col=0;
        int i=row;
        pattern(row,col,i);
    }
}
