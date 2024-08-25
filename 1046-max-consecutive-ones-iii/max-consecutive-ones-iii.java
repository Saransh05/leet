class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int ans=0;
        int i=0,j=0;
        int c=0;
        int n=nums.length;
        while(j<n)
        {
            if(nums[j]==0)
            {
                c++;
                }
             if(c>k)
                {
                    if(nums[i]==0) c--;
                    i++;
                }
            if(c<=k) ans=Math.max(ans,j-i+1);
                j++;
                }
                return ans;
            }
        }