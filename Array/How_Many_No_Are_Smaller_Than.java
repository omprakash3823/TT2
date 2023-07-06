package TT2.Array;


import java.util.HashMap;


public class How_Many_No_Are_Smaller_Than<arr> {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> hset = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hset.put(i, nums[i]);
        }
        int[] arr = new int[nums.length];
        int j = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
           arr[i]=count;
            count=0;

        }
        return arr;

    }


    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] res = smallerNumbersThanCurrent(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
