class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int l=0,r=0;
        int n=nums.length;
        int ans=0;
        int sum=0;
        while(r<n)
        {
            while(sum<=goal && r<n)
            {
             sum=sum+nums[r];
                if(sum==goal)
                {
                    ans++;
                }
                r++;
            }
            sum=0;
            l++;
            r=l;
        }
        return ans;
    }
}