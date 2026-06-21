class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int res=0;
        for(int num:nums)
        {
            if(c==0)
            res=num;

            if(num==res)
            c++;
            else
            c--;
          
        }
        return res;

        
    }
}