package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DesignAnOrderedStream_1656 {
    public static void main(String[] args) {
        OrderedStream os = new OrderedStream(5);
        List<String> l1 = os.insert(3, "ccccc");
        System.out.println(l1);

        List<String> l2 = os.insert(1, "aaaaa");
        System.out.println(l2);

        List<String> l3 = os.insert(2, "bbbbb");
        System.out.println(l3);
        List<String> l4 = os.insert(5, "eeeee");
        System.out.println(l4);

        List<String> l5 = os.insert(4, "ddddd");
        System.out.println(l5);
    }


}

class OrderedStream {
    List<String> list;

    public OrderedStream(int n) {
        list = new ArrayList<>(n);
    }

    public List<String> insert(int idKey, String value) {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(idKey, value);

        return getAllVals(treeMap, idKey);
    }

    private List<String> getAllVals(Map<Integer, String> treeMap, int idKey) {
        List<String> tempList = new ArrayList<>();
/*        if(idKey+1 > treeMap.size()) {
            return tempList;
        }*/

        while (treeMap.get(idKey) != null) {
            tempList.add(treeMap.get(idKey));
            idKey++;
        }
        return tempList;
    }
}