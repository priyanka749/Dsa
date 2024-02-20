  //question(b)
  package One;
import java.util.Arrays;

public class One_b {
    public static int timeToBuiltEngine(int[] engines, int splitCost) {
        int Engine = engines.length; //number of engine
        int[] dp = new int[Engine + 1]; // The minimal time to develop an engine is represented by dp[i].

        Arrays.fill(dp, Integer.MAX_VALUE); //fiiling integer with Max(infinity) 
        dp[0] = 0; //putting the first engine's minimum time at 0.

        for (int i = 1; i <= Engine; i++) { //loop through each engine
            dp[i] = engines[i - 1] + splitCost; // time to build one engine and + split cost
            for (int j = 1; j < i; j++) {  // loop through each possible split point
                dp[i] = Math.min(dp[i], dp[j] + dp[i - j]); // updating minimum time by choosing minimum spilt 
            }
        }
        return dp[Engine]; //return the minimum time to build all engine
    }

    public static void main(String[] args) {
        int[] engines = {1,2,3};
        int splitCost = 1; //cost to split

        int minTime = timeToBuiltEngine(engines, splitCost);
        System.out.println("Minimum time to build all engines: " + minTime);
    }
}