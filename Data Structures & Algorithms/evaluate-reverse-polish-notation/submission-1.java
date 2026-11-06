class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operations = new Stack<>();
        for(String t: tokens){
            if(t.equals("+")){
                int x = operations.pop();
                int y = operations.pop();
                operations.push(x+y);
            }else if(t.equals("-")){
                int x = operations.pop();
                int y = operations.pop();
                operations.push(y-x);
            }else if(t.equals("*")){
                int x = operations.pop();
                int y = operations.pop();
                operations.push(x*y);
            }else if(t.equals("/")){
                int x = operations.pop();
                int y = operations.pop();
                operations.push(y/x);
            }else{
                operations.push(Integer.parseInt(t));
            }
        }
        return operations.pop();
    }
}
