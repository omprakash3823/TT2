package TT2.Array;

public class Remove_duplicate_in_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 1;
        }
        int count=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={2,5,6,6,7,7,7,8,9,9,9};
        int res=removeDuplicates(arr);

        System.out.println(res);
    }
}
