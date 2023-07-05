package TT2.recursion.medium_level;

import java.util.ArrayList;

public class permutation_of_String {
    static ArrayList<String> Subset(String str) {
        if (str.length() == 0) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        char Curr_Char = str.charAt(0);
        String remain_Str = str.substring(1);
        ArrayList<String> ArrList = Subset(remain_Str);
        ArrayList<String> result = new ArrayList<>();
        for (String s : ArrList) {
            for (int i = 0; i <= s.length(); i++) {
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i, Curr_Char);
                result.add(sb.toString());
                System.out.println(result);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> List = Subset(str);
        System.out.println(List);
    }
}
