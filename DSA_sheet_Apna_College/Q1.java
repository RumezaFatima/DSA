package DSA_sheet_Apna_College;

public class Q1 {
    public static int[] FindMaxMin(int array[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return new int[] { max, min };
    }

    public static void main(String[] args) {
        int A[] = { 4, 9, 6, 5, 2, 3 };
        int[] result = FindMaxMin(A);
        System.out.println("Max: " + result[0] + ", Min: " + result[1]);
    }
}
