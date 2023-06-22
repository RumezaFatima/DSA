package DayTwo;

public class GreatestArray {
 
    // Print array elements greater than average
    static void printAboveAvg(int array[], int n)
    {
        // Find average
        float avg = 0;
        for (int i = 0; i < n; i++)
            avg += array[i];
        avg = avg / n;
     
        // Print elements greater than average
        for (int i = 0; i < n; i++)
            if (array[i] > avg)
                System.out.print(array[i] + " ");
    }
 
    // Driver program
    public static void main (String[] args)
    {
        int array[] = { 5, 4, 6, 9, 10, 12, 13 };
        int a = array.length;
        printAboveAvg(array, a);
    }
}
