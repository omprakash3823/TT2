package TT2.recursion.without_Arraylist;

public class Subsequence {
    static void Sub_seq(String s, String out) {
        if(s.length()==0){
            System.out.print(" "+out+",");
            return;
        }
        char str=s.charAt(0);
        String remaining_str=s.substring(1);
        Sub_seq(remaining_str,out);
        Sub_seq(remaining_str,out+str);
    }

    public static void main(String[] args) {
        String s = "RAVI";
        String out="";
        System.out.print("[");
        Sub_seq(s,out);
        System.out.println(" ]");
    }
}
