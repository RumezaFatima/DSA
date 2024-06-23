package DSA_sheet_Apna_College;

public class Q3 {
    public static int SubArraySum(int nums[]) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update the current sum
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update the maximum sum if the current sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum sum found
        return maxSum;
    }

    public static void main(String[] args) {
        // Initialize the array of integers
        int[] numbers = { 1, 2, 3, 4 };
        // Call the method to find the maximum subarray sum
        System.out.println(SubArraySum(numbers)); // Output should be 10
    }
}

// To optimize, we can use Kadane's Algorithm, which has a time complexity of
// 𝑂(𝑛).
