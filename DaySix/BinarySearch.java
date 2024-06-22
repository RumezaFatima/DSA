package DaySix;

import java.util.Arrays;

public class BinarySearch {
    // Method to perform binary search on a sorted array
    public static int binSearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        // Loop until the start index is less than or equal to the end index
        while (start <= end) {
            // Calculate the mid index
            int mid = (start + end) / 2;
            // Check if the key is present at mid index
            if (numbers[mid] == key) {
                return mid;
            }
            // If key is greater than the mid element, search in the right half
            if (numbers[mid] < key) {
                start = mid + 1;
            }
            // If key is smaller than the mid element, search in the left half
            else {
                end = mid - 1;
            }
        }
        // Return -1 if the key is not found
        return -1;
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Initialize the array of integers
        int numbers[] = { 1, 2, 3, 4, 56, 4, 2, 4, 5, 6 };
        int key = 6;

        // Sort the array before performing binary search
        Arrays.sort(numbers);

        // Print the sorted array for reference
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Call the binSearch method and print the result
        int index = binSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not found in the array.");
        } else {
            System.out.println("Index of the key is: " + index);
        }
    }
}
