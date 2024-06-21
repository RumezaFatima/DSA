package DayFive;

public class AvgOfThree {

    public static void AvgNum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("A is greatest");
        }
        if (b > a && b > c) {
            System.out.println("B is greatest");
        } else {
            System.out.println("C is greatest");
        }
    }

    public static void main(String[] args) {
        AvgNum(10, 11, 12);
    }
}
