package leetcode.SumOfValuesAtIndicesWithKSetBits_2859;

import java.util.List;

public class SumOfValuesAtIndicesWithKSetBits_2859 {
    public static void main(String[] args) {
        SumOfValuesAtIndicesWithKSetBits_2859 sof = new SumOfValuesAtIndicesWithKSetBits_2859();
        List<Integer> nums = List.of(4,3,2,1);
        int k = 2;
        int result = sof.sumIndicesWithKSetBits(nums, k);
        System.out.println("result: "+result);
    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int result = 0;
        for(int i = 0; i < nums.size(); i ++)
            if(Integer.bitCount(i) == k)
                result += nums.get(i);
        return result;
    }
    public int sumIndicesWithKSetBitsLambda(List<Integer> nums, int k) {
        return nums.stream().filter(a -> Integer.bitCount(a) == k).peek(System.out::println).mapToInt(Integer::intValue).sum();
    }
}