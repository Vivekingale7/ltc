import java.util.ArrayList;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        int k = 0 , maxLen = 0;     
        int count = 0;      

        for (int i = 1; i < s.length(); i++) {
           
            for (int j = k; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    k = j + 1;
                }
            }
            
            count = i - k + 1;

         if (count > maxLen) {
                maxLen = count;
            }
        }
      
        return maxLen;
    
        
        }

        
    

    public static void main(String args[]){

        String s = "abcabcbb";

        lengthOfLongestSubstring(s);

    }
}