package leetcode;

import java.util.List;
import java.util.Objects;

public class CountItemsMatchingARule_1773 {
    public static void main(String[] args) {
        CountItemsMatchingARule_1773 countItemsMatchingARule1773 = new CountItemsMatchingARule_1773();
        List<List<String>> items = List.of(List.of("qqqq","qqqq","qqqq"), List.of("qqqq","qqqq","qqqq"), List.of("qqqq","qqqq","qqqq"),
                List.of("qqqq","qqqq","qqqq"),List.of("qqqq","qqqq","qqqq"),List.of("qqqq","qqqq","qqqq"),List.of("qqqq","qqqq","qqqq"));

        String ruleKey = "name";
        String ruleValue = "qqqq";
        int res = countItemsMatchingARule1773.countMatches(items, ruleKey, ruleValue);
        System.out.println("Res : " + res);
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        for (int i = 0; i < items.size(); i++) {

            if (Objects.equals(ruleKey, "type") && (Objects.equals(items.get(i).get(0), ruleValue))) {
                res++;

            }

            if (Objects.equals(ruleKey, "color") && (Objects.equals(items.get(i).get(1), ruleValue))) {
                res++;

            }

            if (Objects.equals(ruleKey, "name") && (Objects.equals(items.get(i).get(2), ruleValue))) {
                res++;

            }
        }
        return res;
    }
}