package TT2.recursion;


public class prime_no_or_not {
    static boolean prime_or_not(int n,int low) {
        if (n < 2) {
            return false;
        }
        if(n%low==0){
            return false;
        }
        if(low*low>n){
            return true;
        }
        return prime_or_not(n,low+1);
    }
    public static void main(String[] args) {
       boolean x= prime_or_not(15,2);
        System.out.println("true for prime false for not prime "+x);
    }
}
