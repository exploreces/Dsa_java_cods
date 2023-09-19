public class CountingBits {

    // Bit Manipulation
    /*
     * Given an integer n, return an array ans 
     * of length n + 1 such that for each i (0 <= i <= n), 
     * ans[i] is the number of 1's in the binary representation of i.
     */

     

    
        public int[] countBits(int n) {
            int result [] = new int[n+1];
            for (int i = 1; i <= n; i++) {
               result[i] = result[i/2] + i % 2;     // counting one in a number and providing output.
           }
           return result;
        }
    }
    

