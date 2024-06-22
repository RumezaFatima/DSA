package DaySix;

import java.util.*;

// Class declaration for LargestNumber
public class LargestNumber {

    // Method to get the largest number from an array
    public static int getLargest(int numbers[]) {
        // Initialize the largest number to the smallest possible integer value
        int largest = Integer.MIN_VALUE;
        // Initialize the smallest number to the smallest possible integer value
        // int smallest = Integer.MAX_VALUE;

        // Loop through each element in the array
        for (int i = 0; i < numbers.length; i++) {
            // Check if the current element is greater than the current largest number
            if (largest < numbers[i]) {
                // Update the largest number
                largest = numbers[i];
            }
            // if (smallest > numbers[i]) {
            // Update the largest number
            // smallest = numbers[i];
            // }
        }
        // Return the largest number found
        return largest;
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Initialize the array of integers
        int numbers[] = { 1, 2, 3, 4, 56, 4, 2, 4, 5, 6 };
        // Call the getLargest method and print the result
        System.out.println("largest number is: " + getLargest(numbers));
        // System.out.println("smallest number is: " + getLargest(numbers));
    }
}
