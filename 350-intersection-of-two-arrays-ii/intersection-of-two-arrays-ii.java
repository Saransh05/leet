class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer> h= new HashMap<Integer,Integer>();
        ArrayList<Integer> l=new ArrayList<Integer>();
        for(int x: nums1)
        {
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(int j=0;j<nums2.length;j++)
        {
            if(h.containsKey(nums2[j])&&h.get(nums2[j])>0)
            {
                l.add(nums2[j]);
                h.put(nums2[j],h.getOrDefault(nums2[j],0)-1);
            }
        }
        int[] arr=new int[l.size()];
        int t=0;
        for(int x:l)
        {
           arr[t++]=x;
        }
       return arr;
    }
}