class Solution {
    public static int strStr(String haystack, String needle) {
        
                int i=0,j=0,count=0;
                while( j<needle.length() && i<haystack.length() ){
                    if(needle.charAt(j)==haystack.charAt(i)){
                       j++; 
                 
                    }else{
                        
                        j=0;
                        i=count;
                         count++;
                        }
                   i++;
                }
        
                if(j==needle.length()){
                    return i-j;
                }
        
                return -1;
            }
        

    

    public static void main(String[] args){

        String haystack = "sadbutsad";

        String needle = "sad";

        strStr(haystack,needle);
    }
}