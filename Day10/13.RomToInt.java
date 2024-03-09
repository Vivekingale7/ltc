class Solution {
    public int romanToInt(String s) {
     int number = 0;
     int answer = 0;
     int prev = 0 ;

     for (int i = s.length() - 1; i >= 0; i--) {
      
        if (s.charAt(i) == 'I') {
             number = 1;
         } else if (s.charAt(i) == 'V') {
             number = 5;
         } else if (s.charAt(i) == 'X'){
             number = 10;
         } else if (s.charAt(i) == 'L'){
             number = 50;
         } else if (s.charAt(i) == 'C') {
             number = 100;
         } else if (s.charAt(i) == 'D') {
             number = 500;
         } else if (s.charAt(i) == 'M') {
             number = 1000;
         }
         if (number < prev) {
             answer -= number;
         } else {
             answer += number;
         }
         prev = number;
     }
     return answer;
 }
 public static void main(String[] args) {

    Solution solution = new Solution();
    String romanNumeral = "XXXIV";
    
    int result = solution.romanToInt(romanNumeral);
    System.out.println("Integer value of " + romanNumeral + " is: " + result);
}
}