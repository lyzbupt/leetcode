class Solution{
	public String addBinary(String a, String b){
		int lenA = a.length();
		int lenB = b.length();
		int i = 0, carry = 0;
		String res = "";
		while(i<lenA || i<lenB || carry != 0){ // 只要还没数字结束，就继续
			int x = (i<lenA) ? (a.charAt(lenA-i-1) -'0') : 0;
			int y = (i<lenB) ? (b.charAt(lenB-i-1) -'0') : 0;
			res = (x+y+carry)%2 +res;
			carry = (x+y+carry)/2;
			i++;
		}
		return res;
	}
}