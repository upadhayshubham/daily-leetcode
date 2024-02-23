package leetcode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindTheWinnerOfTheCircularGame_1823 {
    public static void main(String[] args) {
        FindTheWinnerOfTheCircularGame_1823 findTheWinnerOfTheCircularGame1823 = new FindTheWinnerOfTheCircularGame_1823();
        int n = 5;
        int k = 2;

        int winner = findTheWinnerOfTheCircularGame1823.findTheWinner(n, k);
        System.out.println("Winner is : " + winner);
    }

    public int findTheWinner(int n, int k) {
        List<Integer> listOfFriends = IntStream.range(1, n + 1).boxed().collect(Collectors.toList());
        int start = 0;
        while (listOfFriends.size() != 1) {
            start = start + (k - 1);
            if (start >= listOfFriends.size()) {
                start = start % listOfFriends.size();
            }
            listOfFriends.remove(start);
        }
        return listOfFriends.get(0);
    }
}