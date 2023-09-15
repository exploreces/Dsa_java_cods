public class isSubsequence {
// 2 pointers

/*Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
*/
  
        public boolean isSubsequence(String s, String t) {
            int i = 0, j = 0;
                while (i < s.length() && j < t.length()) {
                    if (s.charAt(i) == t.charAt(j)) {
                        i += 1;
                    }
                    j += 1;
                }
                
                return i==s.length();
            }
        
    
}
