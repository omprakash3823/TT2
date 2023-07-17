package TT2.Array;

import java.util.Arrays;

public class Merge_Two_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,5,6,9};
        int n=arr1.length;
        int m=arr2.length;
        merge(arr1,n,arr2,m);
    }
}
