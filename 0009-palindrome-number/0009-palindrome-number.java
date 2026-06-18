class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        String pd="";
        for(int i=0;i<s.length();i++)
        {
          pd=s.charAt(i)+pd;
        }
        return (pd.equals(s));
    }
}