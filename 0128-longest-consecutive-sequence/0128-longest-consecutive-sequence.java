class Solution {
    public int longestConsecutive(int[] nums) {
         if (nums.length == 0) return 0;
        int maxLength = 1;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                int x = num;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count++;
                }
                maxLength = Math.max(maxLength, count);
            }
        }
        return maxLength;
    }
}