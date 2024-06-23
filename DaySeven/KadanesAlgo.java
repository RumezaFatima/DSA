package DaySeven;

public class KadanesAlgo {
    // Method to find the maximum subarray sum using Kadane's Algorithm
    public static void Kadanes(int num[]) {
        // Initialize variables:
        // ms (maxSum) will store the maximum subarray sum found so far
        // cs (currentSum) will store the current subarray sum
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        // Iterate through the array
        for (int i = 0; i < num.length; i++) {
            // Add the current element to the current subarray sum
            cs = cs + num[i];

            // If the current subarray sum becomes negative, reset it to 0
            if (cs < 0) {
                cs = 0;
            }

            // Update the maximum subarray sum if the current subarray sum is greater
            ms = Math.max(cs, ms);
        }

        // Print the maximum subarray sum found
        System.out.println("Our max subarray sum is: " + ms);
    }

    public static void main(String[] args) {
        // Initialize the array of integers
        int numbers[] = { -1, 9, 8, -9, 8, 6, -5, 4, 2 };

        // Call the Kadane's Algorithm method to find the maximum subarray sum
        Kadanes(numbers);
    }
}
