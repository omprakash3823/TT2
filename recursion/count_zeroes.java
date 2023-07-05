package TT2.recursion;

public class count_zeroes {
    static int count_zero(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            count = count + 1;
        }
        n = n / 10;
        return n;
    }

    public static void main(String[] args) {
        int zeroes = count_zero(900, 0);
        System.out.println("number of zeroes are " + zeroes);
    }
}
