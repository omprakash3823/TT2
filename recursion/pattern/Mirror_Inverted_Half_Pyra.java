package TT2.recursion.pattern;

public class Mirror_Inverted_Half_Pyra {
    static void print_star(int no_of_star){
        if(no_of_star==0){
            return;
        }
        System.out.print("*");
        print_star(no_of_star-1);
    }
    static void printstar(int noofstar){
        if(noofstar==0){
            return;
        }
        System.out.print(" ");
        printstar(noofstar-1);
    }
    static void pattern(int row ,int current_row){
        if(row==0){
            return;
        }
        printstar(current_row-1);
        print_star(row);
        System.out.println();
        pattern(row-1,current_row+1);
    }
    public static void main(String[] args) {
       pattern(5,1);
    }
}
