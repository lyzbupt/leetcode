class Solution{
	public int compress(char[] chars){
		int indexAns = 0;
		int index = 0;
		while(index < chars.length){
			char currentChar = chars[index];
			int count = 0;
			while(index < chars.length && chars[index] == currentChar){
				index ++ ;
				count ++ ;
			}
			chars[indexAns++] = currentChar;
			if(count != 1){  // 如果只有一个的话，后面不加数字
				for(char c : Integer.toString(count).toCharArray())
					chars[indexAns++] = c;
			}
		}
		return indexAns;
	}
}
// https://leetcode.com/problems/string-compression/discuss/92559/Simple-Easy-to-Understand-Java-solution
/*    chars[] 也要改，所以不对
class Solution {
    public int compress(char[] chars) {
    	if(chars.length == 0)
    		return 0;
    	int res = 1, count = 1;
    	char temp = chars[0];
    	for(int i = 1; i < chars.length;i++){
    		if(temp != chars[i]){
    			temp = chars[i];
    			while(count / 10 >0){
    				count /= 10;
    				res++;
    			}
    			res++;  // 上一个的 add 个位数
    			//res += count;
    			count = 1; // 这一个的字母
    			res++;  // 这一个的字母
    		}else{
    			count ++;
    		}
    	}
    	while(count / 10 >0){
			count /= 10;
			res++;
    	}
    	res++;  // 上一个的 add 个位数
    	return res;
    }
}
*/
