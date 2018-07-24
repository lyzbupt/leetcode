// https://leetcode.com/problems/reverse-vowels-of-a-string/discuss/81225/Java-Standard-Two-Pointer-Solution
class Solution{
	public String reverseVowels(String s){
		if(s == null || s.length() == 0)
			return s;
		String vowels = "aeiouAEIOU";
		char[] chars = s.toCharArray();   // 为了一个一个取出来
		int start = 0;
		int end = s.length()-1;
		while(start<end){
			while(start < end && !vowels.contains(chars[start]+"")){
				start++;
			}
			while(start < end && !vowels.contains(chars[end]+"")){
				end--;
			}
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			start++;
			end--;
		}
		return new String(chars);
	}
}