package TT2.String;

public class Strig_Halve_Is_Same_or_Not {
    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2, n);
        int c1 = 0;
        System.out.println(a);
        System.out.println(b);
        int c2 = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U' || a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                c1 += 1;

            }
        }System.out.println(c1);
        for (int j = 0; j < b.length(); j++) {
            if (b.charAt(j) == 'A' || b.charAt(j) == 'E' || b.charAt(j) == 'I' || b.charAt(j) == 'O' || b.charAt(j) == 'U' || b.charAt(j) == 'a' || b.charAt(j) == 'e' || b.charAt(j) == 'i' || b.charAt(j) == 'o' || b.charAt(j) == 'u') {
                c2 += 1;

            }
        }System.out.println(c2);
        if(c1==c2){
            return true;
        }
        else return false;

    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("Bopk"));
    }

}
