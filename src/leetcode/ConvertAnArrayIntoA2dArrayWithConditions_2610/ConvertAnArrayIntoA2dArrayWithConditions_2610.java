package leetcode.ConvertAnArrayIntoA2dArrayWithConditions_2610;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConvertAnArrayIntoA2dArrayWithConditions_2610 {

    public static void main(String[] args) {
        ConvertAnArrayIntoA2dArrayWithConditions_2610 con = new ConvertAnArrayIntoA2dArrayWithConditions_2610();
        int[] nums = new int[]{1,2,3,4};

        /*//con.findMatrix(nums);
        Map<Integer, Integer> occurenceMap = con.makeOccurenceMap(nums);
        occurenceMap.entrySet().forEach(System.out::println);*/
        List<List<Integer>> matrix = con.findMatrix(nums);
        matrix.forEach(innerList -> {
            String line = String.join(", ", String.valueOf(innerList));
            System.out.println(line);
        });

    }

    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> occurenceMap = makeOccurenceMap(nums);
        List<Integer> tempList;
        List<List<Integer>> result = new ArrayList<>();

        while (!occurenceMap.isEmpty()) {
            tempList = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : occurenceMap.entrySet()) {

                tempList.add(entry.getKey());

                if (entry.getValue() <= 1) {
                    occurenceMap.remove(entry.getKey());
                } else {
                    occurenceMap.put(entry.getKey(), entry.getValue() - 1);
                }
            }
            result.add(tempList);
        }
        return result;
    }

    private Map<Integer, Integer> makeOccurenceMap(int[] nums) {
        Map<Integer, Integer> occurenceMap = new ConcurrentHashMap<>();
        for (int i : nums) {
            int occurence = occurenceMap.getOrDefault(i, 0);
            occurence = occurence + 1;
            occurenceMap.put(i, occurence);
        }
        return occurenceMap;
    }

}