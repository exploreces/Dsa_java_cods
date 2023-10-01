public class increasing_tripletSubsequence {
    /*
     * 
     * Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.

     */
    class Solution {
        public boolean increasingTriplet(int[] nums) {
            int firstMin = Integer.MAX_VALUE;
            int secondMin = Integer.MAX_VALUE;
            for (int num : nums) {
                if (num <= firstMin) {
                    firstMin = num;
                } else if (num <= secondMin) {
                    secondMin = num;
                } else {
                    System.gc();
                    return true;
                }
            }
            return false;
        }
    }
    
}
