package TT2.Array;

import java.util.HashMap;
import java.util.HashSet;

public class Maximum_Sum_of_Distinct_Subarrays_With_Length_K {
    public static long maximumSubarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> Hset=new HashMap<>();
        long ans = 0;
        int i = 0, j = 0, n = nums.length;
        long temp = 0;
       while(j<n){
          int  num=nums[j];
           temp+=num;
           Hset.put(num, Hset.getOrDefault(num,0)+1);
           if(j-i+1<k){
               j++;
           }
          else{
              if(Hset.size()==k){
                  ans=Math.max(temp,ans);
              }
              temp-=nums[i];
              Hset.put(nums[i], Hset.get(nums[i])-1);
              if(Hset.get(nums[i])==0){
                  Hset.remove(nums[i]);
              }
                  i++;
                  j++;
           }
       }
       return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,5,4,2,9,9,8,7};
        int k=3;
        long res=maximumSubarraySum(arr,k);
        System.out.println(res);

    }
}
