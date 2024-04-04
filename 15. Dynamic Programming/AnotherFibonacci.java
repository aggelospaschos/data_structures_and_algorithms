public class AnotherFibonacci {
    
    // Brute Force
    public static int bruteForce(int value) {
    
        if (value <= 1) {
        
            return n;
        }
        return bruteForce(value - 1) + bruteForce(value - 2);
    }

    // Memoization
    public static int memoization(int  value, int[] cache) {
    
        if (value <= 1) {
        
            return n;
        }
        if (cache[value] != 0) {
        
            return cache[value];
        }
        cache[value] = memoization(value - 1, cache) + memoization(value - 2, cache);
        return cache[value];
    }

    // Dynamic Programming
    public static int dp(int value) {
    
        if (value < 2) { 
        
            return value;
        }

        int[] dp = {0,1};
        int i = 2;
        while (i <= value) {
        
            int temporary = dp[1];
            dp[1] = dp[0] + dp[1];
            dp[0] = temporary;
            i++;
        }
        return dp[1];
    }
}
