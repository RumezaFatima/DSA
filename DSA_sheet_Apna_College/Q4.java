package DSA_sheet_Apna_College;

import java.util.Arrays;

public class Q4 {
    public static int ChocolateDistribution(int chocolate[], int student) {
        int minDiff = Integer.MAX_VALUE;
        if (chocolate.length < student) {
            return -1;
        }
        if (chocolate.length == 0 || student == 0) {
            return 0;
        }
        Arrays.sort(chocolate);
        for (int i = 0; i + student - 1 < chocolate.length; i++) {
            int diff = chocolate[i + student - 1] - chocolate[i];
            if (diff < minDiff) {
                minDiff = diff;

            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] packets = { 7, 3, 2, 4, 9, 12, 56 };
        // Number of students
        int students = 3;

        // Call the method to find the minimum difference
        int result = ChocolateDistribution(packets, students);

        // Print the result
        System.out.println("Minimum difference is " + result);
    }
}
