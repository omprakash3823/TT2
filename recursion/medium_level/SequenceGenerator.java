package TT2.recursion.medium_level;

import java.util.ArrayList;
import java.util.List;

public class SequenceGenerator {
    public static List<Integer> generateSequence(int length) {
        List<Integer> sequence = new ArrayList<>();
        int number = 1;
        int increment = 2;

        for (int i = 0; i < length; i++) {
            sequence.add(number);
            number += increment;
            if (i % 2 == 1) {
                increment += 2;
            }
        }

        return sequence;
    }

    public static void main(String[] args) {
        int length = 15;
        List<Integer> sequence = generateSequence(length);
        System.out.println(sequence);
    }
}
