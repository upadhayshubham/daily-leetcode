package leetcode.FindTheOriginalArrayOfPrefixXor_2433;

import java.util.Arrays;

public class FindTheOriginalArrayOfPrefixXor {

    public static void main(String[] args) {
        FindTheOriginalArrayOfPrefixXor findTheOriginalArrayOfPrefixXor = new FindTheOriginalArrayOfPrefixXor();
        int[] pref = new int[]{5, 2, 0, 3, 1};

        int[] res = findTheOriginalArrayOfPrefixXor.findArray(pref);
        Arrays.stream(res).forEach(re -> System.out.printf("" + re));
    }

    public int[] findArray(int[] pref) {
        int result[] = new int[pref.length];
        int previous = 0;

        for (int i = 0; i < pref.length; i++) {
            result[i] = previous ^ pref[i];
            previous = pref[i];
        }
        return result;
    }
}