package leetcode;

import java.util.Arrays;

public class MaximumNumberOfCoinsYouCanGet_1561 {
    public static void main(String[] args) {
        MaximumNumberOfCoinsYouCanGet_1561 maximumNumberOfCoinsYouCanGet1561 = new MaximumNumberOfCoinsYouCanGet_1561();
        int[] piles = new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4};
        int sum = maximumNumberOfCoinsYouCanGet1561.maxCoins(piles);
        System.out.println("Max U can get : " + sum);
    }

    public int maxCoins(int[] piles) {
        int sum = 0;
        int j = piles.length;
        int i = 0;
        Arrays.sort(piles);
        while (i < j) {
            j = j - 2;
            i++;
            sum = sum + piles[j];
        }
        return sum;
    }
}