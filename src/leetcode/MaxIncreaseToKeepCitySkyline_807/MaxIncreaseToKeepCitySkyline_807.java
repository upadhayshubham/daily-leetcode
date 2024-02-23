package leetcode.MaxIncreaseToKeepCitySkyline_807;

public class MaxIncreaseToKeepCitySkyline_807 {
    public static void main(String[] args) {

    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int gridSize = grid.length;
        int[] maxRow = new int[gridSize];
        int[] maxCol = new int[gridSize];

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                maxRow[i] = Math.max(maxRow[i], grid[i][j]);
                maxCol[j] = Math.max(maxCol[j], grid[i][j]);
            }
        }

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                result += Math.min(maxRow[i], maxCol[j]) - grid[i][j];
            }
        }
        return result;
    }
}