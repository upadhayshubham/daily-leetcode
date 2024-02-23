package leetcode.finalValueOfVariableAfterPerformingOperations_2011;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class FinalValueOfVariableAfterPerformingOperations_2011 {
    public static void main(String[] args) {

    }

    public int finalValueAfterOperations(String[] operations) {
        AtomicInteger x = new AtomicInteger();
        Arrays.stream(operations).forEach(op -> {
            if (op.contains("-")) {
                x.getAndDecrement();
            } else if (op.contains("+")) {
                x.getAndIncrement();
            } else {

            }
        });

        return x.get();
    }

    public int finalValueAfterOperations2(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if (op.contains("-")) {
                x--;
            } else if (op.contains("+")) {
                x++;
            } else {

            }
        }
        return x;
    }
}