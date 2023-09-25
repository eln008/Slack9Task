package Task6;
import java.util.LinkedList;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        LinkedList<String> strList = new LinkedList<>();
        for (String str : strs) {
            strList.add(str);
        }

        String prefix = strList.poll();

        while (prefix != null && !prefix.isEmpty()) {
            boolean isCommonPrefix = true;

            for (String str : strList) {
                if (!str.startsWith(prefix)) {
                    isCommonPrefix = false;
                    break;
                }
            }

            if (isCommonPrefix) {
                return prefix;
            }

            prefix = prefix.substring(0, prefix.length() - 1);
        }

        return "";
    }
}
