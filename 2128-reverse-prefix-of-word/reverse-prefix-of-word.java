class Solution {
    public String reversePrefix(String word, char ch) {
        String str="",str2="";
        String ans="";
        int in=word.indexOf(ch);
        str=word.substring(0,in+1);
        str2=word.substring(in+1);
        
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