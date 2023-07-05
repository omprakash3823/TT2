package TT2.BackTracking;

import java.util.ArrayList;
import java.util.List;

class permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permuteUtil(list, new ArrayList<>(), nums);
        return list;
    }
    public static void permuteUtil(List<List<Integer>> list, List<Integer> temp, int[] nums) {
        //base case
        if (temp.size() == nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }
        //recursive case
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            permuteUtil(list, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] num = {2, 3, 4};
        List<List<Integer>> reult = permute(num);
        System.out.println(reult);
    }
}