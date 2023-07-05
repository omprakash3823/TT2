package TT2.recursion.medium_level;

import java.util.ArrayList;

public class Fibonacci_Series {
    static int fibonacci_series(int n){
        if(n<=1){
           return n;
        }
        int first=fibonacci_series(n-1);
        int sec=fibonacci_series(n-2);
        int result=first+sec;
        return result;

    }
    public static void main(String[] args) {
        ArrayList<Integer> series=new ArrayList<>();

        int res=fibonacci_series(5);
        System.out.println(res);
    }
}
