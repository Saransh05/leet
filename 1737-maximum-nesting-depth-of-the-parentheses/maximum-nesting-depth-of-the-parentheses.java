class Solution {
    public int maxDepth(String s) {
        int l=s.length();
        int max=0;
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)=='(')
            {
                c++;
            }
            if(s.charAt(i)==')')
            {
                c--;
            }
            if(max<c)
            {
                max=Math.max(max,c);
            }
        }
        return max;
    }
}