package DaySeven;

public class kadanesNegative {
    // Method to find the maximum subarray sum using Kadane's Algorithm
    public static void Kadanes(int num[]) {
        // Initialize variables:
        // ms (maxSum) will store the maximum subarray sum found so far
        // cs (currentSum) will store the current subarray sum
        int ms = num[0]; // Initialize to the first element to handle all negative cases
        int cs = num[0]; // Start with the first element

        // Iterate through the array starting from the second element
        for (int i = 1; i < num.length; i++) {
            // Update the current subarray sum by considering the current element
            cs = Math.max(num[i], cs + num[i]);

            // Update the maximum subarray sum if the current subarray sum is greater
            ms = Math.max(cs, ms);
        }

        // Print the maximum subarray sum found
        System.out.println("Our max subarray sum is: " + ms);
    }

    public static void main(String[] args) {
        // Initialize the array of integers
        int numbers[] = { -1, -9, -8, -9, -8, -6, -5, -4, -2 };

        // Call the Kadane's Algorithm method to find the maximum subarray sum
        Kadanes(numbers);
    }
}

/*
 * Example Dry Run:
 * Given the array { -1, -9, -8, -9, -8, -6, -5, -4, -2 }:
 * 
 * Start with ms = -1 and cs = -1.
 * Iterate through the array:
 * For i = 1, num[i] = -9, cs = Math.max(-9, -1 + (-9)) = -9, ms = Math.max(-1,
 * -9) = -1.
 * For i = 2, num[i] = -8, cs = Math.max(-8, -9 + (-8)) = -8, ms = Math.max(-1,
 * -8) = -1.
 * For i = 3, num[i] = -9, cs = Math.max(-9, -8 + (-9)) = -9, ms = Math.max(-1,
 * -9) = -1.
 * Continue similarly for the rest of the elements.
 */
