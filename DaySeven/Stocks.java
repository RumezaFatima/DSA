package DaySeven;

public class Stocks {
    // Method to calculate the maximum profit from buying and selling stocks
    public static int buyandSellStocks(int prices[]) {
        // Initialize buyPrice to a very high value so that any price in the array will
        // be lower
        int buyPrice = Integer.MAX_VALUE;
        // Initialize maxProfit to 0
        int maxProfit = 0;

        // Loop through each price in the array
        for (int i = 0; i < prices.length; i++) {
            // If the current price is greater than buyPrice, calculate the profit
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice; // Profit if sold at current price
                // Update maxProfit if the calculated profit is greater than the current
                // maxProfit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // If the current price is less than or equal to buyPrice, update buyPrice
                buyPrice = prices[i];
            }
        }

        // Return the maximum profit
        return maxProfit;
    }

    public static void main(String[] args) {
        // Initialize the prices array
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        // Call the method to calculate the maximum profit
        int maxProfit = buyandSellStocks(prices);

        // Print the maximum profit
        System.out.println("Maximum profit: " + maxProfit);
    }
}
