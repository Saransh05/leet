class Solution {
    public boolean search(int[] nums, int target) {
        int l=0;
        int u=nums.length-1;
        while(l<=u)
        {
            int mid=(l+u)/2;
            if(nums[mid]==target)
            {
                return true;
            }
             if(nums[mid]==nums[l]&&nums[mid]==nums[u])
                {
                    l=l+1;
                    u=u-1;
                    continue;
                }
            else{
                if(nums[l]<=nums[mid])
                {
                    if(nums[mid]>=target&&nums[l]<=target)
                    {
                        u=mid-1;
                    }
                    else{
                        l=mid+1;
                    }
                }
                else{
                    if(nums[mid]<=target&&nums[u]>=target)
                    {
                        l=mid+1;
                    }
                    else{
                        u=mid-1;
                    }
                }
               
            }
        }
        return false;
    }
}