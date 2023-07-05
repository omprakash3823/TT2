package TT2.Array;

public class Array_Is_Sorted_or_Not {
    static void approach_2(int arr[], int n) {

        for (int i = 1; i < n; i++) {

            if (arr[i-1]>arr[i]){
                System.out.println("Array is not sorted...");
                return;

            }
        }
        System.out.println("Array is sorted...");
    }

    public static void main(String[] args) {
      int[] arr={2,3,4,6};
      int n=arr.length;
      approach_2(arr,n);
    }
}
