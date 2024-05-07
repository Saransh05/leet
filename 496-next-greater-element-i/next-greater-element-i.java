class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans=new int[nums1.length];
        Stack<Integer> s=new Stack<>();
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int num:nums2)
        {
            while(!s.isEmpty()&&s.peek()<=num)
            {
                m.put(s.pop(),num);
            }
            s.push(num);
        }
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=m.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}