package DaySix.Patterns;

public class FloydsTriangle {
    public static void Floyds(int totrows) {
        int counter = 1;
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Floyds(5);
    }
}
