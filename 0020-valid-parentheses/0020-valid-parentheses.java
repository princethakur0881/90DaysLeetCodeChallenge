class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
            for(int i=0;i<n;i++){
                char x = s.charAt(i);
                if(x=='('||x=='{'||x=='['){
                    st.push(x);
                }
                else{
                    if(st.isEmpty()){
                        return false;
                    }
                    if((x==')' && st.peek()!='(')|| (x==']' && st.peek()!='[')||(x=='}' && st.peek()!='{')){
                        return false;
                    }
                    st.pop();
                }
            }
            return st.isEmpty();

    }
}