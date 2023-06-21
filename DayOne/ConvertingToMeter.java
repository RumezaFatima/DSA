package DayOne;
import java.util.Scanner;

public class ConvertingToMeter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a number to convert from inches to meter");
        int length=sc.nextInt();
        double meter;
        meter = 0.025 * length;
        System.out.println("The number is" + meter);
        }
    }
}
