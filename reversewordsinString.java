import java.util.Arrays;
import java.util.Collections;
/*
 * 
 * Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"

 */
public class reversewordsinString {
    class Solution {
    public String reverseWords(String s) {
        String [] word =s.trim().split(" +");
        Collections.reverse(Arrays.asList(word));
        return String.join(" ", word);
       
        

       
        
    }
}
    
}
