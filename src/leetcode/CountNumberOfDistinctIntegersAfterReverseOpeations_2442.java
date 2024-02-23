package leetcode;

import java.util.HashSet;
import java.util.Set;

public class CountNumberOfDistinctIntegersAfterReverseOpeations_2442 {
    public static void main(String[] args) {
        CountNumberOfDistinctIntegersAfterReverseOpeations_2442 cmc = new CountNumberOfDistinctIntegersAfterReverseOpeations_2442();
        int[] nums = new int[] {2,2,2};
        int distinctIntegers = cmc.countDistinctIntegers(nums);
        System.out.println("Distinct  : " + distinctIntegers);
    }

    public int countDistinctIntegers(int[] nums) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {
            StringBuilder sb = new StringBuilder();
            sb.append(num);
            sb.reverse();

            uniqueSet.add(Integer.parseInt(sb.toString()));
            uniqueSet.add(num);
        }
        return uniqueSet.size();
    }
}