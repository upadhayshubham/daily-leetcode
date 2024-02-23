package leetcode.HowManyNumbersAreSmallerThanTheCurrentNumber_1365;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber_1365 {
    public static void main(String[] args) {
        HowManyNumbersAreSmallerThanTheCurrentNumber_1365 hmn = new HowManyNumbersAreSmallerThanTheCurrentNumber_1365();
        int[] nums = new int[]{7,7,7,7};

        int[] result = hmn.smallerNumbersThanCurrent(nums);
        Arrays.stream(result).forEach(System.out::println);
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i] && j != i) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}