class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++)
        {

            int num=nums[i];
            int more=target-num;
            if(h.containsKey(more))
            {
              arr[0]=h.get(more);
              arr[1]=i;
            }
            else{
                h.put(nums[i],i);
            }
        }
        return arr;
    }
}