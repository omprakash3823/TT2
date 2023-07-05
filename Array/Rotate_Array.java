package TT2.Array;

import java.util.Scanner;

public class Rotate_Array {
    static int Rotate_helper(int option) {
        System.out.println("Enter the choice \n 1.Rotate clockwise \n 2.Rotate anticlockwise");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }

    public static int no_of_rotate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rotation ");
        int r_time = sc.nextInt();
        return r_time;
    }

    static int[] Rotate_Clockwise_helper(int[] arr, int r_time) {
        int[] clock = new int[0];
        for (int i = 1; i <= r_time; i++) {
            clock = Rotate_clockwise(arr);
        }
        return clock;
    }

    public static int[] Rotate_clockwise(int[] arr) {
        int temp = arr[0];
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    private static int[] Rotate_AntiClockwise_helper(int[] arr, int r_time) {
        int[] r = new int[0];
        for (int i = 1; i <= r_time; i++) {
            r = Rotate_anticlockwise(arr);
        }
        return r;
    }

    public static int[] Rotate_anticlockwise(int[] arr) {
        int temp = arr[arr.length - 1];
        int n = arr.length - 1;
        for (int i = n; i > 0; i--) {
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int n = 3;
        int[] arr = {3, 4, 5, 6, 8, 9, 4, 7};
        int res = Rotate_helper(n);
        System.out.println("you choose :- " + res);
        switch (res) {
            //Case statements
            case 1: {
                int no_of_R_time = no_of_rotate();
                int[] clock_w = Rotate_Clockwise_helper(arr, no_of_R_time);
                for (int i = 0; i < clock_w.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            break;
            case 2:
                int no_of_R_time = no_of_rotate();
                int[] clock_w = Rotate_AntiClockwise_helper(arr, no_of_R_time);
                for (int i = 0; i < clock_w.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;
            default:
                System.out.println("Choose correct option");
        }
    }
}
