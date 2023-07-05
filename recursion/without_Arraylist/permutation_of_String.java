package TT2.recursion.without_Arraylist;

public class permutation_of_String {
    static void permutation(String s, String out) {
        if (s.length() == 0) {
            System.out.println(out);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            String rem_str = s.substring(0, i) + s.substring(i + 1);
            permutation(rem_str, out + str);
        }


    }

    public static void main(String[] args) {
        String s = "ram";
        String out = "";
        permutation(s, out);
    }
}
