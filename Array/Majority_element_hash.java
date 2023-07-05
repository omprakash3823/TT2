package TT2.Array;

import java.util.HashMap;

public class Majority_element_hash {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.keySet().contains(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            if (map.get(nums[i]) > (nums.length / 2)) {
                return nums[i];
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int[] arr={1,1,0,4,5,5,5,5,5};
        int res=majorityElement(arr);
        System.out.println("Majority element is :- "+res);
    }
}
