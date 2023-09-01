package TT2.Array;

import java.util.HashMap;
import java.util.Stack;

public class Array_Target {
        static void approach_2(int arr[], int target) {

        // TC : 0(n)

        // SC: O(n)
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int e : arr) {

            if (map.get(e) == null) {
                map.put(target - e, e);

            } else {

                System.out.println(map.get(e) + "," + e);
                break;
            }

        }

    }

    public static void main(String[] args) {
        int[] arr={2,4,5,3,8,7,5,0};
        int n=16;
        approach_2(arr,n);
    }
}
