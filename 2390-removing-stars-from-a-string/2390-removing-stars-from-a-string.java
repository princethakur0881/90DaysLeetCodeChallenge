class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*'){
                stk.pop();
            }
            else{
                stk.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:stk){
sb.append(c);
        }
return sb.toString();
    }
}