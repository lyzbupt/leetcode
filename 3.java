

class Solution{
	public int lengthOfLongestSubstring(String s){
		HashMap<Character, Integer>map = new HashMap<Character, Integer>();
		int l = 0;
		int start = 0;
		int n = s.length();
		for(int i = 0; i<n; i++){
			 if(returnDef(map,s.charAt(i))>=start){       //查看这个char之前有没有出现
				l=Math.max(l,i-start);                    //计算因为重复而产生的新的substring的
														//长度和之前最长的比哪个长
				start=map.get(s.charAt(i))+1;            //因重复所以start+1
			}
			map.put(s.charAt(i),i);                      //不管有没有出现都把他替换掉
		}
		return Math.max(n-start,l);                     // 返回最大的长度数值       
	}
	public int returnDef(HashMap<Character, Integer>map, Character c){
		if(map.get(c)==null){                            //获得map和当前字符
			return -1;									 //没有，返回1
		}
		return map.get(c);								 //有，返回之前的指针
	}
}