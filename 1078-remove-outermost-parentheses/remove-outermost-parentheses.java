class Solution {
    public String removeOuterParentheses(String s) {
        int i,c1=0,c2=0,c3=0,c4=0;
        String str1="",str2="",strf="",ret="";
        for (i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                str1=str1+s.charAt(i);
                c1++;
                   }
            else if(s.charAt(i)==')')
            { 
                str1=str1+s.charAt(i);
                c2++;
            }
            if(c1==c2)
            {
                str2=str2+str1;
                strf=strf+str2.substring(1,(c1+c2-1));
                str2="";
                str1="";
                c1=0;
                c2=0;
            }
        }
        for(i=0;i<strf.length();i++)
        {
            if(strf.charAt(i)=='(')
            {
                c3++;
            }
            else{
                c4++;
            }
        }
        if(c3==c4)
        {
            return strf;
        }
        else{
            return ret;
        }
    }
}