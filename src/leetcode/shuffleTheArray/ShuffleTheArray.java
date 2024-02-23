package leetcode.shuffleTheArray;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = new int[] {2,5,1,3,4,7};
        int n= 3;
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        int[] shuffledArr = shuffleTheArray.shuffle(nums, n);

        Arrays.stream(shuffledArr).forEach(System.out::print);
    }

    public int[] shuffle(int[] nums, int n) {
        int[] shuffledArr = new int[nums.length];
        int x = n - 1;
        for (int i = 0; i< n; i++ ) {
            shuffledArr[2*i] = nums[i];
            shuffledArr[2*i+1] = nums[2*i +1 + x];
            x--;
        }
        return shuffledArr;
    }
}