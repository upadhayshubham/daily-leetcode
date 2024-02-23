package leetcode.FindTheUsersActiveMinutes_1817;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindTheUsersActiveMinutes_1817 {
    public static void main(String[] args) {
        FindTheUsersActiveMinutes_1817 findTheUsersActiveMinutes1817 = new FindTheUsersActiveMinutes_1817();
        int[][] logs = new int[][]{{1, 1}, {2, 2}, {2, 3}};
        int k = 4;

/*        Map<Integer, Set<Integer>> freqMap = findTheUsersActiveMinutes1817.makeFrequencyMap(logs);

        freqMap.forEach((key, value) -> {
            System.out.print(key);
            System.out.print("--->");
            value.forEach(System.out::print);
            System.out.println("\n");
        });*/
        int[] result = findTheUsersActiveMinutes1817.findingUsersActiveMinutes(logs, k);

        Arrays.stream(result).forEach(System.out::println);
    }

    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] result = new int[k];
        Map<Integer, HashSet<Integer>> frequency = makeFrequencyMap(logs);

        for(Map.Entry entry : frequency.entrySet()) {
            int uam = frequency.get(entry.getKey()).size();
            result[uam-1]++;
        }

        return result;
    }

    private Map<Integer, HashSet<Integer>> makeFrequencyMap(int[][] logs) {
        Map<Integer, HashSet<Integer>> frequency = new HashMap<>();

        for(int[] log: logs) {
            int id = log[0];
            int time = log[1];

            HashSet<Integer> hs = frequency.computeIfAbsent(id, s -> new HashSet<>());
            hs.add(time);
        }

        return frequency;
    }
}