package leetcode.QueriesOnNumberOfPointsInsideACircle_1828;

public class QueriesOnNumberOfPointsInsideACircle_1828 {

    public static void main(String[] args) {

    }

    public int[] countPoints(int[][] points, int[][] queries) {
        int[] distance = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            int[] query = queries[i];

            int x2 = query[0];
            int y2 = query[1];
            int r = query[2];

            for (int[] point : points) {
                int x1 = point[0];
                int y1 = point[1];

                if (checkEuclideanDistance(x1, y1, x2, y2) <= r) {
                    count++;
                }
            }
            distance[i] = count;
        }
        return distance;
    }

    private double checkEuclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt( ( Math.pow((x2 - x1), 2) ) + ( Math.pow((y2 - y1), 2) ) );
    }
}