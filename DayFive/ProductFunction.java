package DayFive;

import java.util.*;

public class ProductFunction {
    public static int calculateProduct(int num1, int num2) {
        int product = num1 * num2;
        System.out.println("product is:" + product);
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateProduct(a, b);
    }
}
