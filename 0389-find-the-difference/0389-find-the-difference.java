class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        String str = s+t;
        for(char c:str.toCharArray()){
            ans^=c;
        // }
        // for(char c:t.toCharArray()){
        //     ans^=c;
        // }
        }
        return ans;
        }
            
}