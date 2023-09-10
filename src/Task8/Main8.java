package Task8;

public class Main8 {
    public static void main(String[] args) {
        SearchInsertPosition solution = new SearchInsertPosition();

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Индекс цели: " + solution.searchInsert(nums1, target1));

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("Индекс цели: " + solution.searchInsert(nums2, target2));

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println("Индекс цели: " + solution.searchInsert(nums3, target3));
    }
}
