package pages;

import java.util.Arrays;
import java.util.List;

public class GimmeMore {
    public static void main(String[] args) {

        List<String> longList = Arrays.asList(
                "This is me",
                "Hello",
                "How are you"
        );

        longList.stream()
                .map(s -> new NicePrinter(s))
                .forEach(nicePrinter -> nicePrinter.printNicely());


    }
}
