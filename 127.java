class Solution{
	public int ladderLength(String start, String end, List<String> wordList){
		Queue<String> queue = new LinkedList<String>();
		queue.add(start);
		queue.add(null);
		Set<String> dict = new HashSet<String>();
		for(String w:wordList) dict.add(w);
		if(!dict.contains(end)) return 0;
		Set<String> visited = new HashSet<String>();
		visited.add(start);
		int level = 1;

		while(!queue.isEmpty()){
			String str = queue.poll();
			if(str!=null){
				for(int i =0; i < str.length();i++){
					char[] chars = str.toCharArray();
					for(char c = 'a'; c <= 'z';c++){
						chars[i] = c;
						String newWord =  new String(chars);
					
						if(newWord.equals(end)) {
							return level +1;
						}
						else if(dict.contains(newWord) && !visited.contains(newWord)){
							queue.add(newWord);
							visited.add(newWord);
						}
					}
				}
			}else{
				
				level++;
				if(!queue.isEmpty()){
					queue.add(null);
				}
			}
		}
		return 0;
	}
}