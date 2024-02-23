package leetcode.QueriesOnAPermutationWithKey_1409;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QueriesOnAPermutationWithKey_1409 {

    public static void main(String[] args) {
        QueriesOnAPermutationWithKey_1409 queriesOnAPermutationWithKey1409 = new QueriesOnAPermutationWithKey_1409();
        int[] queries = new int[]{7,5,5,8,3};
        int m = 8;
        int[] result = queriesOnAPermutationWithKey1409.processQueries(queries, m);

        Arrays.stream(result).forEach(System.out::println);
    }

    public int[] processQueries(int[] queries, int m) {
        List<Integer> permutations = IntStream.rangeClosed(1, m).boxed().collect(Collectors.toList());
        int[] result = new int[queries.length];
        int k = 0;
        for (int i : queries) {
            int index = permutations.indexOf(i);
            if (index > 0) {
                result[k++] = index;
                permutations.add(0, i);
                permutations.remove(index + 1);
            } else {
                result[k++] = 0;
            }
        }
        return result;
    }
}