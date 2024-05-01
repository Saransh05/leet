class Solution {
    public String reversePrefix(String word, char ch) {
        String str="",str2="";
        String ans="";
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(ch==c)
            {
                 str=word.substring(0,i+1);
                 str2=word.substring(i+1);
                 break;
            }
        }
        if(str.equals(""))
        {
            return word;
        }
        for(int i=str.length()-1;i>=0;i--)
        {
            char cr=str.charAt(i);
            ans=ans+cr;
        }
        ans=ans+str2;
        return ans;
    }
}