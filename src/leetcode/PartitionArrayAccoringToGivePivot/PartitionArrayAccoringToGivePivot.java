package leetcode.PartitionArrayAccoringToGivePivot;

import java.util.Arrays;

public class PartitionArrayAccoringToGivePivot {

    public static void main(String[] args) {
        PartitionArrayAccoringToGivePivot partitionArrayAccoringToGivePivot = new PartitionArrayAccoringToGivePivot();
        int[] nums = new int[] {9,12,5,10,14,3,10};

        int[] res = partitionArrayAccoringToGivePivot.pivotArray(nums, 10);

        Arrays.stream(res).forEach(System.out::println);
    }
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int i = 0; // ans's index

        for (final int num : nums)
            if (num < pivot)
                ans[i++] = num;

        for (final int num : nums)
            if (num == pivot)
                ans[i++] = num;

        for (final int num : nums)
            if (num > pivot)
                ans[i++] = num;

        return ans;
    }
}