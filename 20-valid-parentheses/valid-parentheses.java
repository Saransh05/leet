class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('|| s.charAt(i)=='['||s.charAt(i)=='{')
            {
                a.push(s.charAt(i));
            }
            else{
                if(a.isEmpty())return false;
                else if(matching(a.peek(),s.charAt(i))==false)return false;
                else {a.pop();}
            }
        
        }
            return a.isEmpty();
        }
    
    public boolean matching(char a,char b)
    {
        return (a=='(' &&b==')'||
        a=='['&b==']'||
        a=='{'&&b=='}');
    }
}