package TT2.recursion.medium_level;

public class Josephus_Problem {
    static int left_man(int n,int k){
        if(n==1){
            return 1;
        }
        else{
            return left_man(n-1,k)+k-1%n+1;
        }
    }
    public static void main(String[] args) {
        int n=7;
        int k=2;
        int res=left_man(n,k);
        System.out.println(res);
    }
}
