package DaySix;

public class ArrayPairs {
    // Method to print all pairs in the given array
    public static void printPairs(int[] numbers) {
        int n = numbers.length;
        // Outer loop picks the first element of the pair
        for (int i = 0; i < n; i++) {
            // Inner loop picks the second element of the pair
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Initialize the array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };
        // Call the method to print all pairs
        printPairs(numbers);
    }
}
