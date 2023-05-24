package regexandstreams;

import java.util.List;
import java.util.Optional;

public class CodeRunner {
    public static void main(String[] args) {
        List newList = List.of(1, 2, 3, 10, 4, 5, 7, 8, 9, 11, 12, 6, 15, 16, 19);
        StreamsExample se = new StreamsExample();
        int newSum = se.returnSumFromList(newList);
        int newMax = se.returnMaxFromList(newList);
        List newListOfOdds = se.returnOdds(newList);
        List newListOfDivisibleBy3 = se.returnFromPredicate(newListOfOdds, s -> s % 3 == 0);
        System.out.println(newSum);
        System.out.println(newMax);
        System.out.println(newListOfOdds);
        System.out.println(newListOfDivisibleBy3);
        se.moreOperations(newList);
        System.out.println(se.sortAList(newList));
        Optional<Integer> sumOfList = se.sumOptional(newList);
        sumOfList.ifPresent(System.out::println);
    }
}
