package TT2.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class pre_min {
    static List<Integer> leftSmaller(int n, int a[]) {
        //code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!stack.isEmpty() && a[i] <= a[stack.peek()]) {
                stack.pop();
            }
            arrayList.add(stack.isEmpty() ? -1 : a[stack.peek()]);
            stack.push(i);
        }
        return arrayList;

    }

    public static void main(String[] args) {
        int[] array = {1, 5, 0, 3, 4, 5};
        int n = array.length;
        List<Integer> arr = leftSmaller(n, array);
        System.out.println(arr);
    }
}
