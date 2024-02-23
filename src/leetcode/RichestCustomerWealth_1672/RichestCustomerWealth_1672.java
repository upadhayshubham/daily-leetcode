package leetcode.RichestCustomerWealth_1672;

public class RichestCustomerWealth_1672 {

    public int maximumWealth(int[][] accounts) {
        int maxRowSum = 0;
        for(int [] i : accounts) {
            int s = 0;
            for(int j: i) {
                s = s + j;
            }
            maxRowSum = Math.max(s, maxRowSum);
        }
        return maxRowSum;
    }
}