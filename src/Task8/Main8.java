package Task8;

import java.util.LinkedList;

import static Task8.SearchInsertPosition.searchInsert;

public class Main8 {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(6);

        int target = 5;
        int result = searchInsert(nums, target);
        System.out.println(result);
    }

}
