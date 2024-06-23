package DaySeven;

public class RotatedArraySearch {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the mid element is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which part of the array is sorted
            if (nums[left] <= nums[mid]) {
                // Left part is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    // Target is in the left part
                    right = mid - 1;
                } else {
                    // Target is in the right part
                    left = mid + 1;
                }
            } else {
                // Right part is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    // Target is in the right part
                    left = mid + 1;
                } else {
                    // Target is in the left part
                    right = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        // Test case
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 1;
        int result = search(nums, target);
        System.out.println("Index of target: " + result); // Output: 4
    }
}
