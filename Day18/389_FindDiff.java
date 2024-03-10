class Solution {

        static int num = 0 ;
    public  static char findTheDifference(String s, String t) {
            
            for (int i=0;i<t.length();i++)
            {
            num=num+t.charAt(i);
            }
            for(int i=0;i<s.length();i++)
            {
                num=num-s.charAt(i);
            }
            return (char)num;

        }
        public static void main(String[] args) {
            
            String s = "Viv";

            String t = "Vivek";

            findTheDifference(s,t);

            System.err.println(num);
        }
    }