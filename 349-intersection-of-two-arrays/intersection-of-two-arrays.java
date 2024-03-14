class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            boolean flag=false;
            for(int j=0;j<i;j++)
            {
                if(nums1[i]==nums1[j])
                {
                    flag=true;
                    break;
                }
            }
            if(flag==true)
            {
                continue;
            }
            for(int j=0;j<nums2.length;j++)
            {
                 if (nums1[i]==nums2[j])
                    {
                        a.add(nums1[i]);
                        break;
                    }
                }
        }
         int[] arr = a.stream().mapToInt(i -> i).toArray();
         return arr;
    }
}