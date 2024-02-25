class Solution {
 List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       
        helper(new ArrayList<>(),nums,0);
        return res;
    }
    
    public void helper( List<Integer> ls, int[] nums, int pos) {
        res.add(new ArrayList<>(ls));
        for(int i=pos;i<nums.length;i++) {
            if(i>pos&&nums[i]==nums[i-1]) continue;
            ls.add(nums[i]);
            helper(ls,nums,i+1);     
            ls.remove(ls.size()-1);
        }
    }
}