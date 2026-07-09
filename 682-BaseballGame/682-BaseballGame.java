// Last updated: 7/9/2026, 10:15:59 AM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> a = new Stack<>();
        for (String o : operations) {
            if (o.equals("+")) {
                int top = a.pop();
                int newTop = top + a.peek();
                a.push(top); 
                a.push(newTop);    
            } else if (o.equals("C")) {

                a.pop();
            } else if (o.equals("D")) {
                a.push(a.peek() * 2);
            } else {
                a.push(Integer.parseInt(o));
            }
        }
        int t = 0;
        for (int s : a) {
            t += s;
        }
        return t;
    }
}