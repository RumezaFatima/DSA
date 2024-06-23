package DSA_sheet_Apna_College;

public class Q2 {
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        // Loop to swap elements from the beginning and end until the middle is reached
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        // Initialize the array of integers
        int numbers[] = { 1, 2, 3, 4, 56, 4, 2, 4, 5, 6 };

        // Reverse the array
        reverse(numbers);

        // Print the reversed array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); // space for better readability
        }
        // System.out.println(); // Print a newline after the array
    }
}
