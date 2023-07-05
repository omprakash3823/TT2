package TT2.recursion;

public class count_digit_in_number {
    static int add_number(int n,int count){
        if(n<10){
            return count;
        }
        else{
            n=n/10;
            count=count+1;
            return add_number(n,count);
        }
    }
    public static void main(String[] args) {
        System.out.println("sum "+add_number(5999,1));
    }
}
