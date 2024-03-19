class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int [] ans=new int[n];
        int j=0,k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0){
                pos[j]=nums[i];
                j++;
            }
            else{
                neg[k]=nums[i];
                k++;
            }
        }
        int l=0,a=0;
        for(int i=0;i<n;i=i+2)
        {
            ans[i]=pos[l];
            ans[i+1]=neg[a];
            l++;
            a++;
        }
        return ans;
    }
}