class Solution {
    public int maxProduct(int[] nums) {
        int res=Integer.MIN_VALUE;
        int prod=0;
        for(int i=0;i<nums.length;i++)
        {
            prod=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                 res=Math.max(prod,res);
                 prod=prod*nums[j];
            }
            res=Math.max(prod,res);
        }
        
        return res;
    }
}