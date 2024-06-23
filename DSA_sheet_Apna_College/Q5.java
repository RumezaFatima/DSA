package DSA_sheet_Apna_College;

public class Q5 {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0)
            return -1;

        // Step 1: Find the pivot
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // Now, left is the pivot
        int pivot = left;
        left = 0;
        right = n - 1;

        // Step 2: Determine which part of the array to search
        if (target >= nums[pivot] && target <= nums[right]) {
            left = pivot;
        } else {
            right = pivot - 1;
        }

        // Step 3: Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Q5 sol = new Q5();

        // Example 1
        int[] nums1 = { 4, 5, 6, 7, 0, 1, 2 };
        int target1 = 0;
        System.out.println("Index of target " + target1 + ": " + sol.search(nums1, target1)); // Output: 4

    }
}
