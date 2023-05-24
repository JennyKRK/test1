package regexandstreams;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public StreamsExample() {
    }

    protected int returnSumFromList(List<Integer> listOfIntegers) {
        return listOfIntegers.stream().reduce(Integer::sum).orElseThrow();
    }

    protected int returnMaxFromList(List<Integer> listOfIntegers) {
        return listOfIntegers.stream().reduce(0, Integer::max);
    }

    protected List returnOdds(List<Integer> listOfIntegers) {
        return listOfIntegers.stream()
                .filter(a -> a % 2 == 1)
                .collect(Collectors.toList());
    }

    protected List<Integer> returnFromPredicate(List<Integer> listOfInt, Predicate<Integer> p) {
        return (List<Integer>) listOfInt.stream().filter(p).collect(Collectors.toList());
    }

    protected void moreOperations(List<Integer> listOfInteger) {
        listOfInteger.stream().filter(a -> a % 2 == 0)
                .map(a -> Math.pow(a, 2))
                .forEach(a -> System.out.println(a));
    }

    protected List<Integer> sortAList(List<Integer> listOfIntegers) {
        return listOfIntegers.stream().sorted().collect(Collectors.toList());
    }

    protected Optional<Integer> sumOptional(List<Integer> l1) {
        return l1.stream().reduce(Integer::sum);
    }

    protected int returnFirstItemExceedingZero(List<Integer> listOfIntegers) {
        return listOfIntegers.stream().filter(i -> i < 0).findFirst().orElseThrow();
    }


}
