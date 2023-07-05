package TT2.recursion.medium_level;

import java.io.*;
import java.util.*;

class Solution1 {
    public static boolean isPerfectNumber(int number, int divisor, int sum) {
        if (divisor == 0) {
            return sum == number;
        }
        if (number % divisor == 0) {
            sum += divisor;
        }
        return isPerfectNumber(number, divisor - 1, sum);
    }

    public ArrayList<Integer> perfect(int n) {
        ArrayList<Integer> perfectNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isPerfectNumber(i, i / 2, 0)) {
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;
    }
}

public class sec_question {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);

        Solution1 solution = new Solution1();
        ArrayList<Integer> result = solution.perfect(n);
        System.out.println(result);
    }
}
