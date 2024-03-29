class Solution {
    public static int firstUniqChar(String s) {
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        String s = "leetcode";

        firstUniqChar(s);
    }
}