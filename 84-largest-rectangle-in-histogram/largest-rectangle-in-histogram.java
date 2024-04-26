class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> pss=new Stack<>();
        Stack<Integer> nss=new Stack<>();
        int n=heights.length;
        int [] ps=new int[n];
        int [] ns=new int[n];
        ps[0]=-1;
        pss.push(0);
        int curr=0,ans=0;
        for(int i=1;i<n;i++)
        {
         while(pss.isEmpty()==false && heights[i]<=heights[pss.peek()])
         {
            pss.pop();
         }
         ps[i]=pss.isEmpty()? -1:pss.peek();
          pss.push(i);
        }
      for(int i=n-1;i>=0;i--)
      {
        while(nss.isEmpty()==false && heights[i]<=heights[nss.peek()])
        {
            nss.pop();
        }
        ns[i]=nss.isEmpty()?n:nss.peek();
        nss.push(i);
      }
      for(int i=0;i<n;i++)
      {
        curr=heights[i];
        curr+=(i-ps[i]-1)*heights[i];
        curr+=(ns[i]-i-1)*heights[i];
        ans=Math.max(ans,curr);
      }
      return ans;
    }

}