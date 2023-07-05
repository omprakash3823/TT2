package TT2.recursion;

public class string_rev {
    static String rev_str(String s){
       if(s.length()==1) {
           return String.valueOf(s.charAt(0));
       }
       return rev_str(s.substring(1))+s.charAt(0);

    }



    public static void main(String[] args) {
        String str="RAVI";
        System.out.println("reverse is "+rev_str(str));
    }
}
