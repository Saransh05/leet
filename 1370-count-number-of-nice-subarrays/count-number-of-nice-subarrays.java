class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        return num(nums,k)-num(nums,k-1);
    }
    public int num(int[] nums,int k)
    {
        int l=0,r=0;
        int n=nums.length;
        int sum=0;
        int count=0;
        if(k<0) return 0;
        while(r<n)
        {
          sum+=nums[r];
          while(sum>k)
          {
            sum-=nums[l];
            l++;
          }
          count=count+(r-l+1);
          r++;
        }
        return count;
    }
}