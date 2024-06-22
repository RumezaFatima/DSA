package DaySix;

public class Subarrays {
    // Method to print all subarrays in the given array
    public static void printSubarrays(int[] arr) {
        int totalSubArray = 0;
        int sum = 0;
        int n = arr.length;
        // Outer loop picks the starting index of the subarray
        for (int start = 0; start < n; start++) {
            // Inner loop picks the ending index of the subarray
            for (int end = start; end < n; end++) {
                // Print subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k]; // add the value of the element to totalSum
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays is: " + totalSubArray);
        System.out.println("total sum of an subarray is: " + sum);
    }

    public static void main(String[] args) {
        // Initialize the array of integers
        int[] numbers = { 1, 2, 3, 4 };
        // Call the method to print all subarrays
        printSubarrays(numbers);
    }
}
