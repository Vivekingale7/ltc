class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        String str = new String(arr);
        String str1 = new String(arr1);
        if(str.equals(str1)) {
            return true;
        }
        return false;
    }
}