class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        int presum=0;
        h.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
          presum=presum+nums[i];
          int rem=presum-k;
          count =count+h.getOrDefault(rem,0);
          h.put(presum,h.getOrDefault(presum,0)+1);
        }
        return count;
    }
}