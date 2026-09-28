class Solution {
     
    public String removeDuplicates(String s) {
    //     int n = s.length();
    //     if(n==0||n<0) return "";
    //   StringBuilder str = new StringBuilder("");
    //     Stack<Character> st =new Stack<>();
    //     for(int i=0;i<n;i++){
    //         if(st.isEmpty()){
    //             st.push(s.charAt(i)); 
    //             continue;
    //         }
    //        if (!st.isEmpty() && s.charAt(i) == st.peek()) { 
    //        st.pop(); 
    //         continue; 
    //         }
    //         st.push(s.charAt(i));
    //     }
    //        while (!st.empty()) {
    //         str.insert(0, st.pop()); 
    //     }
    //         return str.toString();
    Stack<Character> stack = new Stack<>();
        for(char p : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == p)
                stack.pop();
            else
                stack.push(p);
        }
        StringBuilder sb = new StringBuilder();
        for(char l : stack) sb.append(l);
        return sb.toString();
    }
}