package DayFive;

import java.lang.Math;

public class BinToDec {
    public static void binToDec(int binNum) {
        int myNum = binNum; // Store original binary number
        int pow = 0; // Initialize power to 0
        int decNum = 0; // Initialize decimal number to 0

        while (binNum > 0) {
            int lastDigit = binNum % 10; // Extract the last digit of binary number
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow)); // Convert to decimal and add to result
            pow++; // Increment power for the next binary digit
            binNum = binNum / 10; // Remove the last digit from the binary number
        }
        System.out.println("decimal no." + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        binToDec(11);
    }
}
