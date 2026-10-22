class Solution {
    public int calculate(String s) {
       Deque<Integer> myStack = new ArrayDeque<>();
        char sign = '+';
        long res = 0, tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) tmp = 10 * tmp + ch - '0';
            if (!Character.isDigit(ch) && ch != ' ' || i == s.length() - 1) {
                if (sign == '-') myStack.push((int) -tmp);
                else if (sign == '+') myStack.push((int) tmp);
                else {
                    int num;
                    if (sign == '*') num = (int) (myStack.peek() * tmp);
                    else num = (int) (myStack.peek() / tmp);
                    myStack.pop();
                    myStack.push(num);
                }
                sign = ch;
                tmp = 0;
            }
        }
        while (!myStack.isEmpty()) {
            res += myStack.peek();
            myStack.pop();
        }
        return (int) res;  
    }
}