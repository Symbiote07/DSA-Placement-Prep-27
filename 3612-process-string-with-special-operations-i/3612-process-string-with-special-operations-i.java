class Solution {
    public String processStr(String s) {
        StringBuilder result=new StringBuilder();
        char ch;
        int l;
        l=s.length();
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(Character.isLowerCase(ch))
            {
                result.append(ch);

            }
            else if(ch=='*')
            {
                if(result.length()>0)
                {
                    result.deleteCharAt(result.length()-1);
                }
            }
            else if(ch=='#')
            {
                result.append(result.toString());
            }
            else if(ch=='%')
            {
                result.reverse();

            }

        }
        return result.toString();
    }
}