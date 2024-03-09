class Solution {
    public static String addStrings(String num1, String num2) {
        if(num1.length()==0 && num2.length()==0){
            return "";
        }
       
       if(num1.length()>num2.length()){
           String temp = num1;
           num1 = num2;
           num2 = temp;
       }

       num1 = new StringBuffer(num1).reverse().toString();
       num2 = new StringBuffer(num2).reverse().toString();

        String str = "";
        int carry = 0;
       for(int i=0;i<num1.length();i++){
           int sum = num1.charAt(i)-48+num2.charAt(i)-48+carry;
           str += sum %10;
           carry = sum/10;
       }

       for(int i=num1.length();i<num2.length();i++){
           int sum = num2.charAt(i)-48+carry;
           str += sum % 10;
           carry = sum /10;
       }

       if(carry>0){

           str +=carry;
       }

       str = new StringBuffer(str).reverse().toString();

       return str;

    }

    public static void main(String args[]){
        String num1 ="11";

        String num2 = "123";

        addStrings(num1, num2);
    }
}