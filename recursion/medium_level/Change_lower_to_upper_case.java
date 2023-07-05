package TT2.recursion.medium_level;

import java.util.ArrayList;

public class Change_lower_to_upper_case {
    static void lower_to_upper(ArrayList<String> arrayList, ArrayList<String> arr, int n) {
        if (n >= arrayList.size()) {
            return;
        }

        arr.add(arrayList.get(n).toUpperCase());
        lower_to_upper(arrayList, arr, n + 1);
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ram");
        arrayList.add("mohan");
        arrayList.add("boy");

        ArrayList<String> arr = new ArrayList<>();
        lower_to_upper(arrayList, arr, 0);

        System.out.println(arr);
    }
}



















//public class Change_lower_to_upper_case {
//    static ArrayList<String> lower_to_upper(ArrayList<String> arrayList, int n) {
//        ArrayList<String> arr = new ArrayList<>();
//        if (arrayList.size() == n) {
//            return arr;
//        }
//        arr.add(arrayList.get(n).toUpperCase());
//        arr.addAll(lower_to_upper(arrayList, n + 1));
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("ram");
//        arrayList.add("mohan");
//        arrayList.add("boy");
//        int n = 0;
//        System.out.println(lower_to_upper(arrayList, n));
//    }
//}
