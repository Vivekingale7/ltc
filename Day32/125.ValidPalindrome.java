class Solution {
    public static  boolean isPalindrome(String s) {
        String str = "";
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122) || s.charAt(i)>=48 && s.charAt(i)<=57){
                str+=s.charAt(i);
            }
        }
            String str1 = "";
            for(int i=str.length()-1;i>=0;i--){
                str1+=str.charAt(i);
            }
        return str.equalsIgnoreCase(str1);
    }

    public static void main(String[] args) {
        
        String s =  "";
        isPalindrome(s);
    }
}