package DayFive;

public class DecToBin {
    public static void DecToBinary(int n) {
        int myNum = n; // Storing origanl number
        int pow = 0; // Initialize power to 0
        int binNum = 0; // Initialize decimal number to 0

        while (n > 0) {
            int rem = n % 10; // Extract the last digit of Decimal number
            binNum = binNum + (rem * (int) Math.pow(2, pow)); // Convert to binary and add to result
            pow++; // Increment power for the next binary digit
            n = n / 10; // Remove the last digit from the binary number
        }
        System.out.println("Binary no." + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        DecToBinary(11);
    }
}
