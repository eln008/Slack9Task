package Task7;

public class ReverseWordsInString {
        public String reverseWords(String s) {
            if (s == null || s.length() == 0) {
                return "";
            }
            String[] words = s.trim().split("\\s+");

            StringBuilder result = new StringBuilder();

            for (int i = words.length - 1; i >= 0; i--) {
                result.append(words[i]);
                if (i > 0) {
                    result.append(" ");
                }
            }

            return result.toString();
        }
}
