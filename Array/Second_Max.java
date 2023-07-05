package TT2.Array;

public class Second_Max {
    static void secondMax_2(int arr[]) {

        int n = arr.length;

        int max = arr[0];

        int secondMax = -1;

        for (int i = 1; i < n; i++) {

            if (arr[i] > max) {

                secondMax = max;

                max = arr[i];

            }

//            else if (arr[i] != max) {
//
//                if (arr[i] > secondMax) {
//                    secondMax = arr[i];
//
//                }
//
//            }

        }

        System.out.println("Second max : " + secondMax);

    }

    public static void main(String[] args) {
        int[]  arr={3,7,5,7,9,3};
        secondMax_2(arr);
    }
}
