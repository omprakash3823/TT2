package TT2.recursion;

public class palindrome_num {
    static int is_palindrom(int num, int rev){
        if(num==0){
            return rev;
        }
       {
          int a = num % 10;
          rev = rev * 10 + a;
          num = num / 10;
      }
      return is_palindrom(num,rev);
    }
    public static void main(String[] args) {
        int num=343;
        int rev=0;
        int res=is_palindrom(num,rev);
        if(res==num){
            System.out.println(num+" is  palindrome ");
        }
        if(res!=num){
            System.out.println(num+" is not palindrome");
        }

    }
}
