package Task6;

public class Main6 {
    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] strs1 = {"flower", "flow", "fly"};
        System.out.println("Самый длинный общий префикс: " + solution.longestCommonPrefix(strs1));

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Самый длинный общий префикс: " + solution.longestCommonPrefix(strs2));
    }
}
