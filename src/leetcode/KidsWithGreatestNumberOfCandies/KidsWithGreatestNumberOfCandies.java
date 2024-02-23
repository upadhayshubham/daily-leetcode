package leetcode.KidsWithGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        KidsWithGreatestNumberOfCandies kidsWithGreatestNumberOfCandies = new KidsWithGreatestNumberOfCandies();
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = kidsWithGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);

        result.forEach(System.out::print);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxOfArr = 0;
        List<Boolean> result = new ArrayList<>();
        int k = 0;
        for (int i : candies) {
            maxOfArr = Math.max(i, maxOfArr);
        }

        System.out.println("Max of Arr : " + maxOfArr);
        for (int i : candies) {
            System.out.println("i : " + i);
            result.add((i + extraCandies) >= maxOfArr);
        }

        return result;
    }
}