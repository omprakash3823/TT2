package TT2.Array;

public class Color_Sort_1 {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int z = 0, o = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                z++;
            else
                o++;
        }
        for (int i = 0; i < z; i++) {
            nums[i] = 0;
        }
        for (int i = z; i < o + z; i++) {
            nums[i] = 1;
        }
        for(int i=0;i<n;i++){
            System.out.print(" "+nums[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1};
        sortColors(arr);
    }
}
