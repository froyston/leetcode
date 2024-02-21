class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        for (String str : operations) {
            if (str.equals("C")) {
                stack.pop();
            } else if (str.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (str.equals("+")) {
                int top = stack.pop();
                int newTop = stack.peek() + top;
                stack.push(top);
                stack.push(newTop);
            } else {
                stack.push(Integer.valueOf(str));
            }
        }
        while (!stack.isEmpty()) {
            total += stack.pop();
        }
        return total;
    }
}