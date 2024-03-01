class Solution {
    public int singleNonDuplicate(int[] nums) {
            if(nums.length>1){
                if(nums[nums.length-1]!=nums[nums.length-2])
                {
                    return nums[nums.length-1];
                }
                else{
            int i=1;
            while(i<nums.length)
            {
                if(nums[i-1]==nums[i])
                {
                    i=i+2;
                    continue;
                }
                else{
                    return nums[i-1];
                }
            }
            }
    }
    else if(nums.length==1)
    {
        return nums[0];
    }
    return -1;
}
}