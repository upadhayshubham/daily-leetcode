package leetcode.FindThePrefixCommonArrayOfTwoArray_2657;

import java.util.Arrays;

public class FindThePrefixCommonArrayOfTwoArray_2657 {
    public static void main(String[] args) {
        FindThePrefixCommonArrayOfTwoArray_2657 findThePrefixCommonArrayOfTwoArray2657 = new FindThePrefixCommonArrayOfTwoArray_2657();
        int[] A = new int[]{2,3,1};
        int[] B = new int[]{3,1,2};

        int[] result = findThePrefixCommonArrayOfTwoArray2657.findThePrefixCommonArray(A, B);

        Arrays.stream(result).forEach(System.out::println);
    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] result = new int[A.length];
        int[] map = new int[A.length+1];

        int count = 0;
        for(int i = 0; i< A.length; i++) {
            map[A[i]] += 1;

            if(map[A[i]] == 2) {
                count ++;
            }

            map[B[i]] += 1;

            if(map[B[i]] == 2) {
                count++;
            }

            result[i] = count;
        }
        return result;
    }
}