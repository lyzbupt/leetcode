class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length == 0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int a = 0;
        int b = 0;
        for(String s : tokens){
        	if(s.equals("+")){
        		b = stack.pop();
        		a = stack.pop();
        		stack.push(a + b);
        	}
        	else if(s.equals("-")){
        		b = stack.pop();
        		a = stack.pop();
        		stack.push(a - b);
        	}
        	else if(s.equals("*")){
        		b = stack.pop();
        		a = stack.pop();
        		stack.push(a * b);
        	}
        	else if(s.equals("/")){
        		b = stack.pop();
        		a = stack.pop();
        		stack.push(a / b);
        	}
        	else{
        		stack.push(Integer.parseInt(s));
        	}
        }
        return stack.pop();
    }
}