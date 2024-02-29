class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int u=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(l<=u)
        {
            int mid=(l+u)/2;
            if(nums[l]<=nums[mid])
            {
                ans=Math.min(ans,nums[l]);
                l=mid+1;
            }
            else{
                u=mid-1;
                ans=Math.min(ans,nums[mid]);
            }
        }
      return ans;
    }
}