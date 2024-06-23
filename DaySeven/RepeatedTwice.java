package DaySeven;

public class RepeatedTwice {
    public static boolean hasRepeatedTwice(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true; // Found a repeating element
                }
            }
        }
        return false; // No repeating element found
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Example array

        boolean hasRepeated = hasRepeatedTwice(numbers);
        System.out.println("Array has repeating elements: " + hasRepeated);
    }
}
