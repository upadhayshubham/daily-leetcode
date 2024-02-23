package leetcode.CreateTargetArrayInTheGivenOrder_1389;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder_1389 {
    public static void main(String[] args) {
        CreateTargetArrayInTheGivenOrder_1389 createTargetArrayInTheGivenOrder1389 = new CreateTargetArrayInTheGivenOrder_1389();

        int[] nums = new int[]{0, 1, 2, 3, 4};
        int[] index = new int[]{0, 1, 2, 2, 1};
        int[] result = createTargetArrayInTheGivenOrder1389.createTargetArray(nums, index);
        Arrays.stream(result).forEach(System.out::println);
    }


    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> resultList = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            resultList.add(index[i], nums[i]);
        }

        return resultList.stream().mapToInt(x -> x).toArray();
    }
}