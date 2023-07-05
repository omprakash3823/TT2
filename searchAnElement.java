package TT2;

public class searchAnElement {
    static int search(int[] arr, int index, int element) {
        if (arr[index] == element) {
            return index; // if found return the index no. of the element
        }
        if (index == 0) {
            if (arr[0] != element) {
                return -1; // element not present in the array
            }
        }
        return search(arr, index - 1, element);

    }

    public static void main(String[] args) {
        int[] arr = {90};
        int index = arr.length - 1;
        int element = 90;
        int result = search(arr, index, element);
        System.out.println(result);
    }
}