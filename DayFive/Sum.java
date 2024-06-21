package DayFive;

import java.util.Scanner;

public class Sum {
    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10; // Get the last digit
            sum = sum + lastDigit; // Add it to the sum
            num = num / 10; // Remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = sumOfDigits(number);
        System.out.println("Sum of digits in " + number + " is: " + result);
        sc.close();
    }
}
