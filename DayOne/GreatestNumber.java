package DayOne;
import java.util.Scanner;

public class GreatestNumber {

        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                System.out.println("The given numbers are:" + a +" "+ b +" "+ c);
                if (a>b) {
                    System.out.println("A value is the greatest");
                }
                else if (b>c) {
                    System.out.println("B value is the greatest");
                }
                else if (c>a) {
                    System.out.println("C value is the greatest");
                }
            }
        }
}
