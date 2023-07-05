package TT2.recursion;

public class power_cal {
    static int power(int n,int pow){
        if(pow==0){
            return 1;
        }
        else{
            int multi=power(n,pow-1);;
            multi=multi*n;

            return multi;
        }
    }
    public static void main(String[] args) {
        System.out.println("sum "+power(2,2));
    }
}
