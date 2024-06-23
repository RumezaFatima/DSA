package DaySeven;

public class Trapwater {
    // Method to calculate the total amount of water trapped
    public static int trappedwater(int height[]) {
        int n = height.length;

        // Edge case: If there are less than 3 heights, no water can be trapped
        if (n <= 2) {
            return 0;
        }

        // Array to store the maximum height to the left of each index
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // Array to store the maximum height to the right of each index
        int[] rightmax = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // Calculate the total trapped water
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            // The water level at index i is the minimum of the maximum heights to the left
            // and right
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            // The trapped water at index i is the difference between the water level and
            // the height
            totalWater += waterLevel - height[i];
        }

        // Return the total amount of trapped water
        return totalWater;
    }

    public static void main(String[] args) {
        // Initialize the height array
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        // Call the method to calculate the total amount of trapped water
        int totalWater = trappedwater(height);

        // Print the total amount of trapped water
        System.out.println("Total trapped water: " + totalWater);
    }
}
