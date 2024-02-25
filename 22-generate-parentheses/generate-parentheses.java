class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> s= new ArrayList<String>(); 
        String str="";
      parenthesesGenerate(0,0,n,str,s);
      return s;
    }
        public static void parenthesesGenerate(int op,int cl,int n,String str,List <String> s)
        {
             if(cl==n)
             {
                 s.add(str);
                 return;
             }
            else{
                 if(op<n)
             {
                 parenthesesGenerate(op+1,cl,n,str+"(",s);
             }
             if(cl<op)
             {
                  parenthesesGenerate(op,cl+1,n,str+")",s);
             }

            
    }
}
}