package DayOne;

import java.util.*;

public class BillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of the pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter the cost of the pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the cost of the eraser: ");
        float eraser = sc.nextFloat();
        double bill = pen + pencil + eraser;
        System.out.println("Total cost without GST: " + bill);

        double finalbill = (bill * 0.18f + bill);
        System.out.println("Total cost with GST: " + finalbill);
        sc.close();
    }

}
