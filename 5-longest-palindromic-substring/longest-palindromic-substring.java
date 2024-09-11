class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        String max=s.substring(0,1);
        for(int i=0;i<len;i++)
        {
            String odd=pal(s,i,i);
            String even=pal(s,i,i+1);
            if(odd.length()>max.length())
            {
               max=odd;
            }
            if(even.length()>max.length())
            {
                max=even;
            }
        }
        return max;
    }
    public String pal(String s,int left,int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}