class Solution {
    public int numberOfSubstrings(String s) {
        int a=-1,b=-1,c=-1;
        int i=0,j=0;
        int n=s.length();
        int mini=0;
        int count=0;
        while(i<n)
        {
            if(s.charAt(i)=='a') a=i;
            if(s.charAt(i)=='b') b=i;
            if(s.charAt(i)=='c') c=i;
            if(a>=0&&b>=0&&c>=0)
            {
                mini=Math.min(Math.min(a,b),c);
                count=count+(1+mini);
            }
            i++;
        }
        return count;
    }
}