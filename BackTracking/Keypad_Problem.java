package TT2.BackTracking;

import java.util.ArrayList;
import java.util.Scanner;

public class Keypad_Problem {
    static ArrayList<String> string_combination(String n) {
        if (n.length() == 0) {
            ArrayList<String> b_res = new ArrayList<>();
            return b_res;
        }
        return string_combination_helper(n);
    }

    static ArrayList<String> string_combination_helper(String n) {
        if (n.length() == 0) {
            ArrayList<String> b_res = new ArrayList<>();
            b_res.add("");
            return b_res;
        }
        char f_letter = n.charAt(0);
        String rest = n.substring(1);
        ArrayList<String> r_res = string_combination_helper(rest);
        ArrayList<String> m_res = new ArrayList<>();
        String[] codes = {" ", "*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String codeForCh = codes[f_letter - '0'];
        for (int i = 0; i < codeForCh.length(); i++) {
            char chCode = codeForCh.charAt(i);
            for (String r_str : r_res) {
                m_res.add(chCode + r_str);
            }
        }
        return m_res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :- ");
        String str = String.valueOf(sc.nextInt());
        ArrayList<String> res = string_combination(str);
        System.out.println(res);
    }

}
