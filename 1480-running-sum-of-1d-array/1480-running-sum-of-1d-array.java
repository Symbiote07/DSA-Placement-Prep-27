class Solution {
    public int[] runningSum(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            n=n+nums[i];
            nums[i]=n;
        }
        return nums;
        
    }
}