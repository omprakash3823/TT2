package TT2.String;

public class String_To_Integer {
    public static int myAtoi(String s) {
        int n=s.length();
        int sign=1;
        int index=0;
        int r=0;

        while(index<n && s.charAt(index)==' '){
            index++;
        }
        if(index<n && s.charAt(index)=='-'){
            sign=-1;
            index++;
        }
        else {
            if (index<n && s.charAt(index)=='+'){
                sign=1;
                index++;
            }
        }
        while (index<n && Character.isDigit(s.charAt(index))){
            int digit=s.charAt(index)-'0';
            if(r>Integer.MAX_VALUE/10 || (r==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE %10 )){
                return sign==1?Integer.MAX_VALUE :Integer.MIN_VALUE;
            }
            else{
                if(r<=Integer.MIN_VALUE/10){
                    return Integer.MIN_VALUE;
                }
            }
            r=r*10+digit;
            index++;
        }

        return r*sign;
    }
    public static void main(String[] args) {

        System.out.println(myAtoi("2147483646"));
    }
}
