package TT2.recursion.medium_level;
import java.io.*;

class Solution {
    public static String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "";
        }
        int lastDigit = decimal % 16;
        String hexadecimalDigit = "";
        if (lastDigit < 10) {
            hexadecimalDigit = String.valueOf(lastDigit);
        } else {
            char digitChar = (char) (lastDigit - 10 + 'A');
            hexadecimalDigit = String.valueOf(digitChar);
        }
        decimal /= 16;
        return decimalToHexadecimal(decimal) + hexadecimalDigit;
    }

    public String convert(int n) {
        // Converting octal to decimal
        int decimal = 0;
        int base = 1;
        while (n != 0) {
            int lastDigit = n % 10;
            decimal += lastDigit * base;
            n /= 10;
            base *= 8;
        }

        // Converting decimal to hexadecimal using recursion
        return decimalToHexadecimal(decimal);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);

        Solution solution = new Solution();
        String result = solution.convert(n);
        System.out.println(result);
    }
}