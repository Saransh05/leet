class Solution {
    public int majorityElement(int[] nums) {
        int i,j,c=0;
        for(i=0;i<nums.length;i++)
        {
            c=1;
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[j]==nums[i])
                {
                    c++;
                }
            }
            if(c>(nums.length/2))
            {
                return nums[i];
            }
            else{
                c=0;
            }
        }
        return -1;
    }
}