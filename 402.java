class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k) return "0";
        Stack<Character> stack = new Stack();
        for(int i = 0; i < num.length(); i++){
        	char c = num.charAt(i);
        	while(k > 0 && !stack.isEmpty() && stack.peek() > c){
        		stack.pop();
        		k--;
        	}
        	stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(k-- > 0){
        	stack.pop();
        }
        while(!stack.isEmpty()){
        	sb.append(stack.pop());
        }
        sb = sb.reverse();
        while(sb.length() > 1 && sb.charAt(0) == '0')
        	sb.deleteCharAt(0);
        return sb.toString();
    }
}