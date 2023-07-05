package TT2.recursion;

public class Armstrong_no {
    static int isArmstrong(int n){
        if(n==0){
            return 0;
        }
               int a = n % 10;
               int sum = (a * a * a);


       return sum+isArmstrong(n/10);
    }
    public static void main(String[] args) {
        int sum=0;
        int num=153;
       int res= isArmstrong(num);
       if(res==num) {
           System.out.println(num+" armstrong number");
       }
        if(res!=num) {
            System.out.println(num+" is not armstrong number");
        }
    }
}
