class Solution {
    public int largestAltitude(int[] gain) {
        int n=0;
        int num[]=new int[gain.length+1],res=-101;
        for (int i=0;i<gain.length;i++)
        {
            num[i+1]=num[i]+gain[i];
        }
        for(int i=0;i<num.length;i++)
        {
            res=Math.max(res,num[i]);
        }
        return res;

        
    }
}