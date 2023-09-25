package Task7;

public class Main7 {
    public static void main(String[] args) {
        ReverseWords solution = new ReverseWords();

        String s1 = "the sky is blue";
        System.out.println("Результат: \"" + solution.reverseWords(s1) + "\"");

        String s2 = " hello world ";
        System.out.println("Результат: \"" + solution.reverseWords(s2) + "\"");

        String s3 = " a good example ";
        System.out.println("Результат: \"" + solution.reverseWords(s3) + "\"");
    }
}
