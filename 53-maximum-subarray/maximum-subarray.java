class Solution {
    public int maxSubArray(int[] nums) {
        int i,sum=Integer.MIN_VALUE,s=0;
        for(i=0;i<nums.length;i++)
        {
            s=s+nums[i];
           sum=Math.max(sum,s);
           if(s<0)
           {
            s=0;
           }
        }
        System.gc();
        return sum;
    }
}