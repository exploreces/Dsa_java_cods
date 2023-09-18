import java.util.Stack;


//stack

/**
 * asteroidCollision
 * 
 * We are given an array asteroids of integers representing asteroids in a row.
For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

Example 1:
Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
 */
public class asteroidCollision {

  
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++){
            if (!stack.isEmpty() && stack.peek() > 0 && asteroids[i] < 0){
                if (Math.abs(asteroids[i]) == Math.abs(stack.peek())){
                    stack.pop();
                }
               else if (Math.abs(asteroids[i]) > Math.abs(stack.peek())){

                   stack.pop();
                   i--;
               }
            }
            else{
                stack.push(asteroids[i]);
            }
        }  

        int[]ans = new int [stack.size()];
        for(int i =ans.length-1;i>=0;i--){
            ans[i] = stack.pop();
        }   

        return ans;   
    }
}
