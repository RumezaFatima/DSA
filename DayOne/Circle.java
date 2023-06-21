package DayOne;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
	    try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter area for circle");
            float area = sc.nextFloat();
            System.out.println("Enter perimeter for circle");
            float perimeter = sc.nextFloat();
            System.out.println(area + " and " + perimeter);
        }
	}
}
