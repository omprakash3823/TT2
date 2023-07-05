package TT2.Array;

import java.util.Scanner;

public class Rotate_By_Kth_element {

        static int[] rotate_array(int[] nums, int k) {
            int n=nums.length;
            int[] temp= new int[n];
            if(k>n){
                k=k%n;
            }
            int j=0;
            int l=n-k;

            for(int i=l;i<n;i++){
                temp[j]=nums[i];
                j++;
            }
            for(int i=0;i<l;i++){
                temp[j]=nums[i];
                j++;
            }
            for(int i=0;i<n;i++){
                nums[i]=temp[i];
            }
            return temp;
        }

    public static void main(String[] args) {
        int[] arr={2,6,4,8,9,5,6,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Kth position :- ");
        int k=sc.nextInt();
       int[] res= rotate_array(arr,k);
       for(int i=0;i<res.length;i++){
           System.out.print(res[i]+" ");
       }
    }

}
