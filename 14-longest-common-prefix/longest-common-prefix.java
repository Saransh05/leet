class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i,j;
        String str1="",str2="",fin="",a="";
        if(strs.length==1)
        {
            return strs[0];
        }
        else{
        for(i=0;i<strs.length-1;i++)
        {
         String res="";
         str1=strs[i];
         str2=strs[i+1];
         j=0;
          if(str1.isEmpty()||str2.isEmpty())
             {
                 return "";
             }
             else{
         while(j<str1.length()&&j<str2.length())
         {
             if(str1.charAt(0)!=str2.charAt(0))
             {
                 return "";
             }
            
             else{
             if(str1.charAt(j)==str2.charAt(j))
             {
                 res=res+str1.charAt(j);
                 j++;
             }
             else if(res==""){
             j++;
             }
             else{
                 break;
             }
         }
         }
         if(fin==""&&res.length()>0)
         {
             fin=res;
         }
         if(res.length()==0)
         {
             break;
         }
         if(fin.length()>0&&res.contains(fin))
         {
             continue;
         }
         else{
             fin=res;
         }
        }}
        }
        return fin;
    }
}