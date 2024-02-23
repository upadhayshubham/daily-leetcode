package leetcode.DifferenceBetweenOnesAndZeroesInRowAndColumn_2482;

public class DifferenceBetweenOnesAndZeroesInRowAndColumn_2482 {
    public int[][] onesMinusZeros(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int ones[] = new int[m + n];
        int zeroes[] = new int[m + n];

        int idx = 0;

        // Calculating the number of ones , zeroes for each rows
        for (int[] ints : grid) {

            int countOnes = 0;
            int countZeroes = 0;

            for (int j = 0; j < n; j++) {

                if (ints[j] == 1) {

                    countOnes += 1;

                } else {

                    countZeroes += 1;
                }
            }

            ones[idx] = countOnes;
            zeroes[idx] = countZeroes;

            idx += 1;
        }

        // Calculating ones and zeroes for each columns.
        for (int j = 0; j < n; j++) {

            int countOnes = 0;
            int countZeroes = 0;

            for (int[] ints : grid) {

                if (ints[j] == 1) {

                    countOnes += 1;

                } else {

                    countZeroes += 1;
                }
            }

            ones[idx] = countOnes;
            zeroes[idx] = countZeroes;

            idx += 1;
        }

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                grid[i][j] = ones[i] + ones[m + j] - zeroes[i] - zeroes[m + j];
            }
        }

        return grid;

    }
}