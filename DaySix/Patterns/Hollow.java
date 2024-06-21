package DaySix.Patterns;

public class Hollow {
    public static void Hollow_rectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) { // Outer loop
            for (int j = 1; j <= totCols; j++) { // Inner loop
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Hollow_rectangle(4, 5);
    }
}
