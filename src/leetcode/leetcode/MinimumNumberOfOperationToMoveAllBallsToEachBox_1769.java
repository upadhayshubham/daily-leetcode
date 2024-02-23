package leetcode.leetcode;

import java.util.Arrays;

import static java.lang.Math.abs;

public class MinimumNumberOfOperationToMoveAllBallsToEachBox_1769 {
    public static void main(String[] args) {
        MinimumNumberOfOperationToMoveAllBallsToEachBox_1769 minimumNumberOfOperationToMoveAllBallsToEachBox1769 =
                new MinimumNumberOfOperationToMoveAllBallsToEachBox_1769();

        String boxes = "001011";
        int[] result = minimumNumberOfOperationToMoveAllBallsToEachBox1769.minOperations(boxes);
        Arrays.stream(result).forEach(System.out::println);
    }

    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];

        for (int i = 0; i < result.length; i++) {
            int index = boxes.indexOf("1");

            while (index != -1) {
                result[i] = result[i] + abs(index - i);
                index = boxes.indexOf("1", index + 1);
            }
        }
        return result;
    }
}