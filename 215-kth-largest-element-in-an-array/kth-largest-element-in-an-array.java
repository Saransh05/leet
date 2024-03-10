class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> num=new ArrayList<Integer>();
        for(int n:nums)
        {
          num.add(n);
        }
        num.sort(Collections.reverseOrder());
        return num.get(k-1);
    }
}