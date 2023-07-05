package TT2.recursion;

public class All_Prime_In_Given_Range {
        public static void printPrimeNumbers(int start, int end) {
            if (start > end) {
                return;
            }

            if (isPrime(start)) {
                System.out.print(start + " ");
            }

            printPrimeNumbers(start + 1, end);
        }

        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            return isPrimeRecursive(number, 2);
        }

        private static boolean isPrimeRecursive(int number, int n) {
            if (n* n > number) {
                return true;
            }

            if (number % n == 0) {
                return false;
            }

            return isPrimeRecursive(number, n + 1);
        }

    public static void main(String[] args) {
        int start = 3;
        int end = 76;
        printPrimeNumbers(start, end);

    }
}
