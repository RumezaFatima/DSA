package DaySix;

// Class declaration for LinearSearch
public class LinearSearch {

    // Method to perform linear search
    public static int LinearS(int numbers[], int key) {
        // Loop through each element in the array
        for (int i = 0; i < numbers.length; i++) {
            // Check if the current element matches the key
            if (numbers[i] == key) {
                // If match is found, return the index
                return i;
            }
        }
        // If no match is found, return -1
        return -1;
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Initialize the array of integers
        int numbers[] = { 1, 2, 3, 4, 56, 4, 2, 4, 5, 6 };
        // Define the key to be searched
        int key = 56;

        // Call the LinearS method and store the result in index
        int index = LinearS(numbers, key);

        // Check if the key was found
        if (index == -1) {
            // If not found, print "NOT FOUND"
            System.err.println("NOT FOUND");
        } else {
            // If found, print the index
            System.out.println("index is at: " + index);
        }
    }
}
