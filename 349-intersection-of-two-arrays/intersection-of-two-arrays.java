class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> h= new HashSet<>();
        HashSet <Integer> h1=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            h.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++)
        {
            if(h.contains(nums2[j]))
            {
                h1.add(nums2[j]);
            }
        }
        int[] arr=new int[h1.size()];
        int t=0;
        for(int x:h1)
        {
           arr[t++]=x;
        }
       return arr;
    }
}