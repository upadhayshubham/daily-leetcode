package leetcode.CountPairsWhoseSumIsLessThanTarget_2824;

import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget_2824 {
    public static void main(String[] args) {
        CountPairsWhoseSumIsLessThanTarget_2824 countPairsWhoseSumIsLessThanTarget2824 =
                new CountPairsWhoseSumIsLessThanTarget_2824();

        List<Integer> nums = List.of(-6, 2, 5, -2, -7, -1, 3);
        int target = -2;
        int result = countPairsWhoseSumIsLessThanTarget2824.countPairs(nums, target);
        System.out.println("Result: " + result);
    }

    public int countPairs(List<Integer> nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                int sum = nums.get(i) + nums.get(j);

                if (sum < target) {
                    System.out.println("i : " + i + " , " + "j : " + j);
                    result++;
                }
            }
        }
        return result;
    }

}