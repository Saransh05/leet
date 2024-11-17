class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int [] arr=new int[n];
        int c=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==0)
          {
            c++;
          }
          else{
            arr[j]=nums[i];
            j++;
          }
        }
        if(c<nums.length){
        for(int k=0;k<nums.length-c;k++)
        {
            nums[k]=arr[k];
        }
        for(int k=nums.length-c;k<nums.length;k++)
        {
            nums[k]=0;
        }
        }
        else{
             for(int i=0;i<c;i++)
             {
                nums[i]=0;
             }
        }
    }
}