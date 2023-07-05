package TT2.recursion;

public class Pos_Of_String_Con {
    static void printpos(int[] arr, int num, int pos) {
        int i = 0;
        if (arr.length - 1 == pos && arr[arr.length - 1] == num) {
            System.out.print(pos);
            return;
        } else if (arr.length - 1 == pos && arr[arr.length - 1] != num) {
            return;
        }
        if (arr[pos] == num) {
            System.out.print(pos + ",");
        }
        printpos(arr, num, pos + 1);
        return;
    }


    public static void main(String[] args) {
        int[] arr = {5, 9, 8, 7, 5, 5, 9};
        int num = 5;
        int pos = 0;
        printpos(arr, num, pos);
        System.out.print(" are position at which " + num + " is occur. ");
    }
}
