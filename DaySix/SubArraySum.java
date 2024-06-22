package DaySix;

public class SubArraySum {
    // Method to print all subarrays in the given array
    public static void maxSum(int[] arr) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        // Outer loop picks the starting index of the subarray
        for (int start = 0; start < n; start++) {
            // Inner loop picks the ending index of the subarray
            for (int end = start; end < n; end++) {
                // Print subarray from start to end
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum = currsum + arr[k]; // add the value of the element to totalSum
                }
                System.out.println(currsum);
                if (maxSum < currsum) {
                    maxSum = currsum;
                }
            }
        }
        System.out.println("max sum: " + maxSum);
    }

    public static void main(String[] args) {
        // Initialize the array of integers
        int[] numbers = { 1, 2, 3, 4 };
        // Call the method to print all subarrays
        maxSum(numbers);
    }
}
