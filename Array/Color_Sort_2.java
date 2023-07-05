package TT2.Array;

public class Color_Sort_2 {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int z = 0, o = 0, t = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                z++;
            else if (nums[i] == 1)
                o++;
            else
                t++;
        }
        for (int i = 0; i < z; i++)
            nums[i] = 0;
        for (int i = z; i < o + z; i++)
            nums[i] = 1;
        for (int i = z + o; i < z + o + t; i++)
            nums[i] = 2;
        for(int i=0;i<n;i++){
            System.out.print(" "+nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,0,0,1,2,2,2,0,1,2,2,1,0};
        sortColors(arr);
    }
}
