package TT2.recursion.medium_level;

import java.util.ArrayList;

public class Subset_of_String {
    static ArrayList<String> Subset(String s) {
        ArrayList<String> ArrList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char current_element = s.charAt(i);
            if (ArrList.size() == 0) {
                ArrList.add("");
                ArrList.add("" + current_element);
                continue;
            }
            int n=ArrList.size();
            for (int j = 0; j < n; j++) {
                String str = ArrList.get(j) + current_element;
                if (!ArrList.contains(str)) {
                    ArrList.add(str);
                }
            }
        }
        return ArrList;
    }

    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> List = Subset(s);
        System.out.println(List);
    }
}
