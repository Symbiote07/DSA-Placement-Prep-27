class Solution {
    public int mySqrt(int x) {
        int i;
        if(x==1||x==0)
        return x;
        for(i=1;i<=x/2;i++)
        {
            if(x/(i*i)<=0)
            return i-1;
        }
        return --i;
    

        
    }
}