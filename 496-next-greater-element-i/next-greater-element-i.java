class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     Stack<Integer> s = new Stack<>();
     int n=nums1.length;
     int ans[]=new int[n];
     Map<Integer,Integer> m= new HashMap<>();
     s.push(nums2[nums2.length-1]);
    m.put(nums2[nums2.length-1],-1);
     for(int i=nums2.length-2;i>=0;i--)
     {
        int ele=nums2[i];
            while(!s.isEmpty() && ele > s.peek())
            {
               s.pop();
            }
             if(s.isEmpty())
        {
            m.put(ele,-1);
        }
        else{
            m.put(ele,s.peek());
        }
            s.push(ele);
     }
     for(int j=0;j<nums1.length;j++)
     {
        if(m.containsKey(nums1[j]))
        {
            ans[j]=m.get(nums1[j]);
        }
     }
     return ans;
    }
}