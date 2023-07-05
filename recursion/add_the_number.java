package TT2.recursion;

public class add_the_number {
    static int add_number(int n,int sum){
        if(n==0){
            return sum;
        }
        else{
            sum+=n%10;
            n=n/10;
            return add_number(n,sum);
        }
    }
    public static void main(String[] args) {
        System.out.println("sum "+add_number(567,0));
    }
}
