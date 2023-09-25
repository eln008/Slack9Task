package Task7;
import java.util.LinkedList;
public class ReverseWords {
    public static String reverseWords(String s) {
        LinkedList<String> words = new LinkedList<>();

        String[] splitWords = s.trim().split("\\s+");
        for (String word : splitWords) {
            words.addFirst(word);
        }

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }

        return result.toString().trim();
    }

}





