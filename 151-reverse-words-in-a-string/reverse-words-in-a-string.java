class Solution {
    public String reverseWords(String s) {
        int i;
        String str1="",str2="",str3="",str4="";
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
               str2=str1+" "+str2;
               str1="";
            }
            else{
                str1=str1+s.charAt(i);
            }
        }
        str2=str1+" "+str2;
        str2=str2.trim();
        for(i=0;i<str2.length();i++)
        { 
            str3=str3+str2.charAt(i);
            if(str2.charAt(i)==' ' && str3.charAt(0)!=' ')
            {
               str4=str4+str3;
               str3=" ";
            }
            if(str3.charAt(0)==' ')
            {
                str3="";
            }
        }
        str4=str4+str3;
        return str4;
    }
}