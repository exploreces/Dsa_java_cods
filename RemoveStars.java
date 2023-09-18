
import java.util.*;
// stack
/*
 * You are given a string s, which contains stars *.

In one operation, you can:

Choose a star in s.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.
 */
public class RemoveStars {

    class Solution {
        public String removeStars(String s) {
           Stack <Character>stack = new Stack();
           for(int i =0;i<s.length();i++){
               if(s.charAt(i)=='*'){
                   stack.pop();
               }
               else{
                   stack.add(s.charAt(i));
               }
           }
         
            StringBuilder ans = new StringBuilder();
            while(!stack.isEmpty()){
                ans.append(stack.pop());
            }
            ans.reverse();
            return ans.toString();
            
            
        }
    }

    
}
