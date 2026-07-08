class Solution {
    public boolean containsDuplicate(int[] nums) {
            Set<Integer> frq = new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if(frq.contains(nums[i])){
                    return true;
                }
                else{
                    frq.add(nums[i]);
                }
            }
    return false;
    }
}