package leetcode.GroupThePeopleGivenTheGroupSizeTheyBelongTo_1282;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo_1282 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int grpSize = groupSizes[i]; //3
            groups.putIfAbsent(grpSize, new ArrayList<>());
            groups.get(grpSize).add(i);

            if (groups.get(grpSize).size() == grpSize) {
                result.add(new ArrayList<>(groups.get(grpSize)));
                groups.get(grpSize).clear();
            }
        }
        return result;
    }
}