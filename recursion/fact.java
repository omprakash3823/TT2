package TT2.recursion;

public class fact {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return fact(n-1)*n;
        }

    }
    public static void main(String[] args) {
        int result=fact(5);
        System.out.println("factorial "+result);
    }

}
