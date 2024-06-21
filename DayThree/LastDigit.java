package DayThree;

import java.util.*;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        while (num > 0) {
            int LastDigit1 = num % 10;
            System.out.print(LastDigit1);
            num = num / 10;
        }
        System.out.println();
        sc.close();
    }
}
