package TT2.Array;
import java.util.HashSet;

public class SubarrayZeroSum {
    public static String findSubarrayWithZeroSum(int[] arr) {
        int cumulativeSum = 0;
        HashSet<Integer> seenSums = new HashSet<>();

        for (int num : arr) {
            cumulativeSum += num;

            if (cumulativeSum == 0 || seenSums.contains(cumulativeSum)) {
                return "Yes";
            }

            seenSums.add(cumulativeSum);
        }

        return "No";
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        String result = findSubarrayWithZeroSum(arr);
        System.out.println(result);  // Output: Yes
    }
}
