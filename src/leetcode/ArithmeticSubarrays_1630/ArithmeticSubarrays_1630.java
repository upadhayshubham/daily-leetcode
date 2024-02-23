package leetcode.ArithmeticSubarrays_1630;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticSubarrays_1630 {
    public static void main(String[] args) {
        ArithmeticSubarrays_1630 arithmeticSubarrays1630 = new ArithmeticSubarrays_1630();
        int[] nums = new int[]{-12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10};
        int[] l = new int[]{0, 1, 6, 4, 8, 7};
        int[] r = new int[]{4, 4, 9, 7, 9, 10};

        List<Boolean> result = arithmeticSubarrays1630.checkArithmeticSubarrays(nums, l, r);

        result.forEach(System.out::println);
    }

    private static boolean isArithemeticSubarray(List<Integer> tempList) {
        int prevDiff = tempList.get(1) - tempList.get(0);
        int tortoise, hare = 0;
        for (int k = 0; k < tempList.size() - 1; k++) {
            tortoise = k;
            hare = k + 1;

            int curDiff = tempList.get(hare) - tempList.get(tortoise);
            if (prevDiff != curDiff) {
                return false;
            }
            prevDiff = curDiff;
        }
        return true;
    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            List<Integer> tempList = new ArrayList<>();

            for (int j = l[i]; j <= r[i]; j++) {
                tempList.add(nums[j]);
            }

            tempList = tempList.stream().sorted().collect(Collectors.toList());
            result.add(isArithemeticSubarray(tempList));
        }
        return result;
    }

}