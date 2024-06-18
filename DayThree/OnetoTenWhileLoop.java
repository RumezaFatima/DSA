package DayThree;

import java.util.*;

public class OnetoTenWhileLoop {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 100) {
            System.out.print(counter + " ");
            counter++;
        }
        // 1 to n numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int number = 1;
        while (number <= n) {
            System.out.println(number);
            number++;
        }

    }
}
