class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int [] freq = new int[128];
        int maxLength = 0;
        int low =0;
        for(int right = 0;right<n;right++){
            char currCharacter = s.charAt(right);
            freq[currCharacter]++;
        
        while(freq[currCharacter]>1){
            freq[s.charAt(low)]--;
            low++;
        }
        maxLength = Math.max(maxLength,right-low+1);
        }
        return maxLength;
    }
}