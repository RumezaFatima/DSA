package DayFive;

import java.util.Scanner;

public class Palindrom {
    public static boolean isPalindrome(int n) {
        int originalNum = n;
        int reversedNum = 0;

        while (n != 0) {
            int digit = n % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Append it to the reversed number
            n /= 10; // Remove the last digit
        }
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        scanner.close();
    }
}
