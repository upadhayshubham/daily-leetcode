package leetcode;

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray_26 removeDuplicatesFromSortedArray26 = new RemoveDuplicatesFromSortedArray_26();
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int count = removeDuplicatesFromSortedArray26.removeDuplicates(nums);
        System.out.println("Unique : " + count);
    }

    public int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int marker = i + 1; marker < nums.length; marker++) {
                if (nums[marker] != nums[i]) {
                    nums[i + 1] = nums[marker];
                    count++;
                }
            }
        }
        return count + 1;
    }
}