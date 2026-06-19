class Solution {
    public boolean consecutiveSetBits(int n) {
        int t=0;
        while(n>0){
        if((n&1)==1 && ((n>>1)&1)==1)
        t++;
        n=n>>1;
        }
    if(t==1)
    return true;
    return false;
    }
}