public class CountingBits {

    public static void operations() {
    
        // AND
        int n = 1 & 1;

        // OR 
        n = 1 | 0;

        // XOR
        n = 0 ^ 1;

        // NOT (negation)
        n = ~n;

        // Bit Shifting
        n = 1;
        n = n << 1;
        n = n >> 1;
        
        return;
    }

    // Count the number of 1 bits in an int
    public static int countBits(int bits) {
    
        int count = 0;
        while (bits > 0) {
            if ((bits & 1) == 1) {
                count++;
            }
            bits = bits >> 1; // same as bits / 2
        }
        return count;
    }
}