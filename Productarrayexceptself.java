public class Productarrayexceptself {


    /*
     * 
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
     */


     // answer approach:
     /*Calculate the prefix of the given array, in example 1, we have nums=[1,2,3,4] so num's prefix becomes [1,1,2,6]
        Then we calculate the postfix of the array nums, [24,12,4,1]
        Once we have Prefix and Postfix both, then we simply multiply Postfix[i] * Prefix[i]
        Return the product of Postfix[i] * Prefix[i].
      * 
      */

    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
    int[]ans = new int[n];
    int pre =1;
    int post =1;


    
//calculating left side
for(int i =0;i<n;i++){
ans[i]= pre;
pre*=arr[i];

    }
// calculating right side

    for (int i = n-1; i >= 0; i--) {
        ans[i] = ans[i] * post;
      post *= arr[i];
    }
    
    return ans;




}
    
}

    

