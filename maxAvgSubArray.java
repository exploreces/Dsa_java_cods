public class maxAvgSubArray {

    // sliding windows

    /*
     * You are given an integer array nums consisting of n elements, and an integer k.
        Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
     * 
     */

    public double findMaxAverage(int[] nums, int k) {
        int l =0;
        int r =0;
        int presum =0;
        int finals =0;

        while(r<nums.length){
            presum +=nums[r];
            r++;
            if(r>k-1){
                finals = Math.max(finals, presum);
                presum -= nums[l];
                l++;
            }
            
                
        }
        return (double) finals/k;
        
    }
    
}
