class Solution {
    public String largestOddNumber(String num) {
      int i;
      String str="";
      for(i=num.length()-1;i>=0;i--)
      {
          if((int)num.charAt(i)%2!=0)
          {
              str=num.substring(0,i+1);
              break;
          }
      }  
      return str;
    }
}