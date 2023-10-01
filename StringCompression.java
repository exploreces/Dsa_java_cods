public class StringCompression {
    /*
     * 
     * Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

     */

     class Solution {
    public int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1; // Initialize count to 1 for the first character

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else {
                compressed.append(chars[i]);
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1; // Reset count for the new character
            }
        }

        // Append the last character and its count
        compressed.append(chars[chars.length - 1]);
        if (count > 1) {
            compressed.append(count);
        }

        // Copy the compressed string back to the original char array
        String compressedStr = compressed.toString();
        for (int i = 0; i < compressedStr.length(); i++) {
            chars[i] = compressedStr.charAt(i);
        }

        return compressedStr.length();
    }
}
}
