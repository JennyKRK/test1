package regexandstreams;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String word = "Ac 5";
        System.out.println(checkForDigits(word));
        System.out.println(checkForBigLetters(word));
        System.out.println(checkForSmallLetters(word));
        System.out.println(checkForWhitespace(word));
        System.out.println(findWordInWord("Abrakadabra", "abra"));
        System.out.println(findRegexInWord("expelliarmus"));
        System.out.println(findRegexInWord2("expelliermus"));
        System.out.println(findRegexInWord3("iiiiiiii"));
        System.out.println(findRegexInWord4("eeeeeeeeeee"));
    }

    public static boolean checkForDigits(String word) {
        return word.matches(".*\\d.*");
    }

    public static boolean checkForBigLetters(String word) {
        return word.matches(".*[A-Z].*");
    }

    public static boolean checkForSmallLetters(String word) {
        return word.matches(".*[a-z].*");
    }

    public static boolean checkForWhitespace(String word) {
        return word.matches(".*\\s.*");
    }

    public static boolean findWordInWord(String word1, String word2) {
        Pattern pattern = Pattern.compile(word2, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(word1);
        return matcher.find();
    }

    public static boolean findRegexInWord(String word) {
        Pattern pattern = Pattern.compile(".*[0-9].*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(word);
        return matcher.find();
    }

    public static boolean findRegexInWord2(String word) {
        Pattern pattern = Pattern.compile(".*[a-d].*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(word);
        return matcher.find();
    }

    public static boolean findRegexInWord3(String word) {
        Pattern pattern = Pattern.compile(".*[a|e|o].*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(word);
        return matcher.find();
    }

    public static boolean findRegexInWord4(String word) {
        Pattern pattern = Pattern.compile(".*[^e].*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(word);
        return matcher.find();
    }


}
