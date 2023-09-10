package Task5;

public class Main5 {
    public static void main(String[] args) {
        LastWordLength solution = new LastWordLength();

        String s1 = "Hello World";
        System.out.println("Длина последнего слова: " + solution.lengthOfLastWord(s1));

        String s2 = " fly me to the moon ";
        System.out.println("Длина последнего слова: " + solution.lengthOfLastWord(s2));

        String s3 = "луффи все еще джойбой";
        System.out.println("Длина последнего слова: " + solution.lengthOfLastWord(s3));
    }
}
