class Solution {
    public String decodeString(String s) {
        //StringBuilder res = new StringBuilder();
        String res = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int count = 0;
        //int index = 0;
        for(int i = 0; i < s.length(); i++){
        	if(Character.isDigit(s.charAt(i))){ // 先判断是不是数字
        		
        		//while(Character.isDigit(s.charAt(i))){
        			count = 10 * count + (s.charAt(i) - '0'); 
        		//}
        		
        	}else if ( s.charAt(i) == '['){
        		countStack.push(count);
        		count = 0;
        		resStack.push(res); // push上一组的结果，res用来存当前组的结果
        		res = ""; // 生成一个新的
        	}
        	else if(s.charAt(i) == ']'){
        		StringBuilder temp = new StringBuilder(resStack.pop());
        		int repeatNumber = countStack.pop();
        		for(int j = 0 ; j < repeatNumber; j++){
        			temp.append(res);
        		}
        		res = temp.toString();
        	}
        	else{
        		res += s.charAt(i);
        	}
        }
        return res;
    }
}