package TT2.Array;

public class Bar_Chat {
    static int secondMax_2(int arr[],int n) {


        int max = arr[0];

//        int secondMax = -1;

        for (int i = 1; i < n; i++) {

            if (arr[i] > max) {

//                secondMax = max;

                max = arr[i];

            }
        }
        return max;
    }


    public static void main(String[] args) {

          int[] arr={3,4,5,6,9};

        int n = arr.length;

        int maxElement = secondMax_2(arr, n);

        for (int i = maxElement; i >= 1; i--) {

            for (int j = 0; j < n; j++) {

                if (i <= arr[j]) {

                    System.out.print("\t*");

                } else {

                    System.out.print("\t ");

                }

            } System.out.println();
        }
    }
}
