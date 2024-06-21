package DayThree;

import java.util.*;

public class SumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            System.out.println(sum);
            i++;
        }
        int j;
        for (j = 1; j <= 10; j++) {
            System.out.println(j);
        }
        sc.close();
    }
}
