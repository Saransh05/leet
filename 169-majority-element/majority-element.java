class Solution {
    public int majorityElement(int[] nums) {
        int c=1,i,res=0;
        for(i=res+1;i<nums.length;i++)
        {    
            if(nums[res]==nums[i])
            {
                c++;
            }
            else{
                c--;
            }
            if(c==0)
            {
                res=i;
                c=1;
            }
        }
        System.out.println(res);
       int d= find(res,nums);
       return d;
    }
    public int find(int res,int[] nums)
    { int c=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==nums[res])
            {
                c++;
            }
        }
        if(c>nums.length/2)
        {
            return nums[res];
        }
        else{
            return -1;
        }
    }
}