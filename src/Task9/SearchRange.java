package Task9;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        // Поиск начальной позиции target
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                right = mid - 1; // Продолжаем поиск в левой половине
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Поиск конечной позиции target
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result[1] = mid;
                left = mid + 1; // Продолжаем поиск в правой половине
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
