package DaySix;

public class ArrayUpdate {
    public static void update(int marks[]) {
        // Method to update each element of the array by adding 1
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 }; // Initialize the array
        update(marks); // Call the update method to increment each element by 1

        // Print the updated marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println(); // Print a new line at the end
    }

}
