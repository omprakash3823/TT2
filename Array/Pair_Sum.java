package TT2.Array;

import java.util.Arrays;

public class Pair_Sum {
    static void Pair_sum(int[] arr, int n){
        Arrays.sort(arr);
        int j=arr.length-1;
        int i=0,count=0;
        while (i< j) {
            int currentSum = arr[i] + arr[j];
            if (currentSum == n) {
                System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
                count+=1;
                i++;
                j--;
            } else if (currentSum < n) { i++;
            } else {
                j--;
            }
        }
       if(count==0){
           System.out.println("Pair Not Found :-------");
       }
    }
    public static void main(String[] args) {
        int[] arr = {3,6,8,9,2,3,8,5,1};
        int n = 10;
        Pair_sum(arr, n);
    }

}
//public class Pair_Sum {
//    static void Pair_sum(int[] arr, int n) {
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i - 1] + arr[i] == n) {
//                int b= arr[i - 1];
//                int c = arr[i];
//                System.out.println(b+","+c);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {3, 10, 7, 6, 9, 8};
//        int n = 17;
//        Pair_sum(arr, n);
//    }
//
//}