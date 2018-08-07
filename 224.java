class Solution{
	public static int calculate(String s){
		int sign = 1;
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();

		for(int i =0; i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){  // 把代表一个数字的表示出来
				int sum = s.charAt(i) - '0';
				while(i+1 < s.length()&& Character.isDigit(s.charAt(i+1))){
					sum = sum*10 + s.charAt(i+1) - '0';
					i++;
				}// 这是一个数
				result += sum*sign;
			} 

			else if(s.charAt(i) == '-'){
				sign = -1;
			}
			else if(s.charAt(i) == '+'){
				sign = 1;
			}
			else if(s.charAt(i) == '('){
				stack.push(result);
				stack.push(sign);
				result = 0;
				sign = 1;
			}
			else if(s.charAt(i) == ')'){
				// stack.pop() 的第一个是push进去的符号
				result = result * stack.pop() + stack.pop();
			}
		}
		return result;
	}
}