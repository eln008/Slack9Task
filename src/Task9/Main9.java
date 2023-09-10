package Task9;

public class Main9 {
    public static void main(String[] args) {
        SearchRange solution = new SearchRange();

        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = solution.searchRange(nums1, target1);
        System.out.println("Начальная и конечная позиции target: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = solution.searchRange(nums2, target2);
        System.out.println("Начальная и конечная позиции target: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {};
        int target3 = 0;
        int[] result3 = solution.searchRange(nums3, target3);
        System.out.println("Начальная и конечная позиции target: [" + result3[0] + ", " + result3[1] + "]");
    }
}
