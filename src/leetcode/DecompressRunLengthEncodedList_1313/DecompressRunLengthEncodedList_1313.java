package leetcode.DecompressRunLengthEncodedList_1313;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DecompressRunLengthEncodedList_1313 {
    public static void main(String[] args) {
        DecompressRunLengthEncodedList_1313 decompressRunLengthEncodedList1313 = new DecompressRunLengthEncodedList_1313();
        int[] nums = new int[]{1,1,2,3};
        int[] result = decompressRunLengthEncodedList1313.decompressRLElist(nums);

        Arrays.stream(result).forEach(System.out::println);
    }

    public int[] decompressRLElist(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        int i = 0;
        while( ((2*i)+1) <= nums.length) {
            int freq = nums[2*i];
            int value = nums[(2*i)+1];
            resultList.addAll(Collections.nCopies(freq, value));

            i++;
        }

        return resultList.stream().mapToInt(x->x).toArray();
    }
}