import java.util.Arrays;

public class MaxNoOfKSumPairs {
// 2 pointers

/*
 * Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
 */
     public int maxOperations(int[] nums, int k) {
     Arrays.sort(nums);
       int l = 0;
       int r = nums.length-1;
       int count=0;

       while(l<r){
           if(nums[l]+nums[r]==k){
               count++;
               l++;
               r--;
               
           }

           else if(nums[l]+nums[r]>k){
               r--;

           }
           else{
               l++;
           }
       }
       return count;
    }
    
}
