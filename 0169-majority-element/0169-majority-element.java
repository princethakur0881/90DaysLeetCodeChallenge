class Solution {
    public int majorityElement(int[] nums) {
      int ans = -1;
      int n = nums.length;
    HashMap<Integer,
            Integer> freq = new HashMap<Integer,
                                        Integer>();
                                        
    for (int i = 0; i < n; i++)
    {
        if(freq.containsKey(nums[i]))
        {
            freq.put(nums[i], freq.get(nums[i]) + 1);
        }
        else
        {
            freq.put(nums[i], 1);
        }
        if (freq.get(nums[i]) > n / 2)
            ans = nums[i];
    }
    return ans;
} 

}