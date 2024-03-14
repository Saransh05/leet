class Solution {
    public int maxFrequencyElements(int[] nums) {
        int a=Integer.MIN_VALUE;
        int res=0;
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int x: nums)
        {
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: h.entrySet())
        {
            a=Math.max(a,e.getValue());
        }
      for(Map.Entry<Integer,Integer> e: h.entrySet())
      {
        if(e.getValue()==a)
        {
           res=res+a;
        }
      }  
      return res;
    }
    
}