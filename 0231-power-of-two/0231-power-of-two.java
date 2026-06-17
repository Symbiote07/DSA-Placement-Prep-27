class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
        return false;
        int ans=1;
        int range= (int) Math.pow(2,30);
        while(ans<n && n<=range){
            ans=ans*2;
        }
        return ans ==n;
        


        
        
    }
}