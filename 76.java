// O(2s+t)
public class Solution{
	public String minWindow(String s, String t){
		if(s==null || s.length()<t.length()||s.length()==0){
			return "";
		}
		HashMap<Character, Integer>map = new HashMap<Character, Integer>();
		for(char c : t.toCharArray()){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c,1);
			}
		}
		int left=0, count =0;
		int minLength = s.length()+1;  
		int minLeft = 0;
		char leftChar, rightChar;
		for(int right=0; right<s.length();right++){
			rightChar = s.charAt(right);
			if(map.containsKey(rightChar)){
				map.put(rightChar, map.get(rightChar)-1);
				if(map.get(rightChar)>=0)
					count++;
				while(count==t.length()){  // this is one of the window
					leftChar = s.charAt(left);
					if(map.containsKey(leftChar)){
						map.put(leftChar, map.get(leftChar)+1);
						if(map.get(leftChar)>0){
							count--;
						}
						if(right-left+1<minLength){
							minLeft = left;
							minLength = right-left+1;
						}
					}
					left++;
				}
			}
		}
		if(minLength>s.length()){
			return "";
		}
		return s.substring(minLeft, minLeft+minLength);
	}
}