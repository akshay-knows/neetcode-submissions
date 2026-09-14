class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length ==0) return false;
        HashSet<Integer> set = new HashSet<>();
        for(Integer s: nums){
            set.add(s);
        }
        if(set.size()==nums.length) return false;
        return true;
    }
}