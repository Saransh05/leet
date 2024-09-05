class Solution {
    public int numberOfSubstrings(String s) {
        int [] arr=new int[3];
        arr[0]=-1;
        arr[1]=-1;
        arr[2]=-1;
        int n=s.length();
        int i=0;
        int count=0;
        while(i<n)
        {
            arr[s.charAt(i)-'a']=i;
            count=count+(1+Math.min(Math.min(arr[0],arr[1]),arr[2]));
            i++;
        }
        return count;
    }
}