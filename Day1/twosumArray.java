import java.util.*;
class Solution {
    public static int[]twoSum(int[] nums, int target) {
        int i=-1,j=-1;
        
        for(i=0 ;i<nums.length;i++){

            for(j=i+1;j<nums.length;j++){

                    if(nums[i]+nums[j]==target){

                        return new int[]{i,j};

                    }
            }
        }
        return new int []{i,j};
    }
    @SuppressWarnings("unused")
    public static void main(String[] args){

        int[] nums = {2,7,11,15};

        int target = 9;
        int arr[] = twoSum(nums,target);

    
        System.out.println(Arrays.toString(arr));
        

     }
}