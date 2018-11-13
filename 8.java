class Solution{
	public int myAtoi(String str){
		int index = 0;
		int sign = 1;
		int total = 0;
		if(str.length() == 0) return 0;

		// 2. remove spaces
		while(index < str.length()&&str.charAt(index) == ' ' )
			index++;

		// 3. handle sings
		if(index < str.length() &&(str.charAt(index) == '+' || str.charAt(index) == '-')){
			sign = str.charAt(index) == '+' ? 1 : -1;
			index++;
		}

		// 4. convert number and avoid overflow
		while(index < str.length()){
			int digit = str.charAt(index) - '0';
			if(digit < 0 || digit > 9) break;
			// check overflow
			if(Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE/10 == total&&
				digit > Integer.MAX_VALUE%10){
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			total = 10 * total + digit;
			index++;
		}
		return sign*total;
	}
}