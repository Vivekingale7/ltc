class Solution {
    
    public int findPeakElement(int[] nums) {
        int max=Integer.MIN_VALUE,flag=0,k=0;       
        for(int i=0;i<nums.length;i++)
        {
           // int n=nums.length;
           
            if(nums[i]>max)
            {
                max=nums[i];
                k=i;
                flag=1;
            }
        }
        if(flag==1)
        {
            return k;
        }
       else
        {
         return 0;
     }       
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {1, 2, 3, 1};
        int peakIndex = solution.findPeakElement(nums);
        
        System.out.println("Peak element found at index: " + peakIndex);
    }
}
