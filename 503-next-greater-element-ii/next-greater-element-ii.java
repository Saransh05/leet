class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s=new Stack<>();
        int [] ans=new int[nums.length];
        Arrays.fill(ans,-1);
        int n=nums.length;
        for(int i=0;i<2*nums.length;i++)
        {
            while(!s.isEmpty() && nums[i%n]> nums[s.peek()])
            {
                int res=s.pop();
                ans[res]=nums[i%n];
            }
            if(i<n)
            {
                s.push(i);
            }
        }
        return ans;
    }
}