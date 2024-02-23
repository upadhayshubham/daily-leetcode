package leetcode.RearrangeArrayElementsBySign_2149;

import java.util.Arrays;

public class RearrangeArrayElementsBySign_2149 {
    public static void main(String[] args) {
        RearrangeArrayElementsBySign_2149 rearrangeArrayElementsBySign2149 = new RearrangeArrayElementsBySign_2149();
        int[] nums = new int[]{3, 1, -2, -5, 2, -4};
        int[] result = rearrangeArrayElementsBySign2149.rearrangeArray(nums);
        Arrays.stream(result).forEach(System.out::println);
    }

    public int[] rearrangeArray(int[] nums) {
        int[] postives = new int[nums.length];
        int p = 0;
        int[] negatives = new int[nums.length];
        int n = 0;
        int[] result = new int[nums.length];
        for (int num : nums) {
            if (num < 0) {
                negatives[n] = num;
                n++;
            } else {
                postives[p] = num;
                p++;
            }
        }

        int k = 0;
        for (int i = 0; i < nums.length && k < result.length; i++) {
            result[k] = postives[i];
            result[k + 1] = negatives[i];
            k = k + 2;
        }

        return result;
    }
}