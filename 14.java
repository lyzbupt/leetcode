public String longestCommonPrefix(String[] strs){
	StringBuilder result = new StringBuilder();
	if(strs!=null && strs.length>0){
		Arrays.sort(strs);
		char[] firstS = strs[0].toCharArray();
		char[] lastS = strs[strs.length-1].toCharArray();

		for(int i=0; i<firstS.length;i++){
			if(lastS.length>i && lastS[i]==firstS[i]){
				result.append(lastS[i]);
			}
			else{
				return result.toString();
			}
		}
	}
	return result.toString();
}