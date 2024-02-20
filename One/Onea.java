package One;

public class Onea {
    public static int minCostToDecorate(int[][] costs) {
        // Validation Input
        if (costs == null || costs.length == 0 || costs[0].length == 0)
            return 0;

        // Initialization
        int n = costs.length; // Number of venues
        int k = costs[0].length; // Number of available themes

        int[][] dp = new int[n][k];

        //  Dynamic Programming Loop
        for (int i = 0; i < n; i++) { // Iterate over venues
            for (int j = 0; j < k; j++) { // Iterate over themes
                
                dp[i][j] = costs[i][j];

                // Updating Costs
                if (i > 0) { // If not the first venue
                    int minPrevCost = Integer.MAX_VALUE; // Initialize the minimum cost of decorating the previous venue
                    for (int x = 0; x < k; x++) { // Iterate over themes of the previous venue
                        if (x != j) { // Exclude the current theme
                            minPrevCost = Math.min(minPrevCost, dp[i - 1][x]); // Update the minimum cost
                        }
                    }
                    dp[i][j] += minPrevCost; // Update the current cost by adding the minimum cost of the previous venue with a different theme
                }
            }
        }

        //  Finding Minimum Cost
        int minCost = Integer.MAX_VALUE; // Initialize the minimum cost
        for (int j = 0; j < k; j++) { // Iterate over themes of the last venue
            minCost = Math.min(minCost, dp[n - 1][j]); // Find the minimum cost among all themes
        }

        // Return Result
        return minCost; // Return the minimum cost of decorating all venues
    }

    public static void main(String[] args) {
        int[][] costs = {{2, 3, 1}, {4, 6, 8}, {3, 2, 5}};
        System.out.println(minCostToDecorate(costs)); // Output: 7
    }
}