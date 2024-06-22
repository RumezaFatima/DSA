package DaySix;

public class PrefixSum {
    public static void maxSumArray(int num[]) {
        int currsum = 0; // Variable to store the current sum of a subarray
        int maxSum = Integer.MIN_VALUE; // Variable to store the maximum sum found so far
        int prefix[] = new int[num.length]; // Prefix sum array to store cumulative sums

        // Calculate the prefix sum array
        prefix[0] = num[0]; // Initialize the first element of prefix sum array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i]; // Calculate prefix sum for each index
        }

        // Nested loops to iterate over all subarrays and find the maximum sum
        for (int i = 1; i < num.length; i++) { // Start from index 1 (as i = 0 is handled separately)
            for (int j = i; j < num.length; j++) { // Start from i to iterate over subarrays
                // Calculate the sum of subarray from index i to index j
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                // Update maxSum if the current sum is greater
                if (maxSum < currsum) {
                    maxSum = currsum;
                }
            }
        }

        // Print the maximum sum found
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        // Initialize the array of integers
        int[] numbers = { 1, -2, 6, -1, 3 };
        // Call the method to print all subarrays
        maxSumArray(numbers);
    }
}
