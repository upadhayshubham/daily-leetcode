package leetcode.WidestVerticalAreaBetweenTwoPointsContainingNoPoints_1637;

import java.util.Arrays;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints_1637 {
    public static void main(String[] args) {
        WidestVerticalAreaBetweenTwoPointsContainingNoPoints_1637 wv =
                new WidestVerticalAreaBetweenTwoPointsContainingNoPoints_1637();

        int[][] points = new int[][]{{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}};
        // int[][] sorted = arrSort(points);
        // System.out.println(Arrays.deepToString(sorted));
        int maxWidth = wv.maxWidthOfVerticalArea(points);
        System.out.println("Final Max Width: " + maxWidth);
    }

    private static int[][] arrSort(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        return points;
    }

    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int maxWidth = 0;

        for (int i = 0; i < points.length - 1; i++) {
            int diff = points[i + 1][0] - points[i][0];
            System.out.println("Diff : " + diff);
            if (maxWidth < diff) {
                maxWidth = diff;
            }
            System.out.println("Max Width : " + maxWidth);
        }
        return maxWidth;
    }
}