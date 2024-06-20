package DayFive;

import java.util.*;

public class SyntaxParameter {
    public static int calculatesum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("sum is " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatesum(a, b);
    }
}
