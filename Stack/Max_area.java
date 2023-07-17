package TT2.Stack;

public class Max_area {
    static int max_A(int[] arr) {
        int n = arr.length;
        int ans = 0, max = 0;
        for (int i = 0; i < n; i++) {
            ans = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] <= arr[j]) {
                    ans += arr[i];
                } else {
                    break;
                }
            }
            for (int k = i + 1; k < n; k++) {
                if (arr[i] <= arr[k]) {
                    ans += arr[i];
                } else {
                    break;
                }
            }
            if (max < ans) {
                max = ans;
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 6};
        int res = max_A(arr);
        System.out.println("max area is " + res);
    }
}
