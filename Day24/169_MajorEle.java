class Solution {
    public static int  majorityElement(int[] nums) {
        int temp = nums[0];
        if (nums.length == 1) {
            return temp;
        }
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (temp == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                temp = nums[i + 1];
            }
        }
        System.err.println(temp);
        return temp;
    }
    public static void main(String[] args){

        int[] nums = {2,2,1,1,1,2,2};

        majorityElement(nums);

        
    }
}