// 433. Minimum Genetic Mutation

public class Solution {
    public int minMutation(String start, String end, String[] bank) {
        if(start.equals(end)) return 0;
        
        Set<String> bankSet = new HashSet<>();
        for(String b: bank) bankSet.add(b);
        
        char[] charSet = new char[]{'A', 'C', 'G', 'T'};
        
        int level = 0;
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                String curr = queue.poll();
                if(curr.equals(end)) return level;
                
                char[] currArray = curr.toCharArray();
                for(int i = 0; i < currArray.length; i++) {
                    char old = currArray[i];
                    for(char c: charSet) {
                        currArray[i] = c;
                        String next = new String(currArray);
                        if(!visited.contains(next) && bankSet.contains(next)) {
                            visited.add(next);
                            queue.offer(next);
                        }
                    }
                    currArray[i] = old;
                }
            }
            level++;
        }
        return -1;
    }
}









/*
	这道题是一个搜索类型的题。 从 start 经过基因库，最后走到 end。 
	返回走的步数。
	可能的路径都在基因库之中。如果无法走通，则返回-1.
	搜索问题，可以有BFS和DFS两种通常解法。
	BFS常用于找单一的最短路线，它的特点是“搜到就是最优解”；
	DFS常用于找所有解的问题，找到的不一定是最优解。
	
	DFS 与 BFS模板：
	https://blog.csdn.net/BillCYJ/article/details/78976932
 */





/*
// 每次只能变异一个基因，因此答案不对。 需要用BFS

class Solution {
    public int minMutation(String start, String end, String[] bank) {
        int count = 0;
        for(int i = 0; i< start.length();i++){
        	if(start.charAt(i) == end.charAt(i)){
        		continue;
        	}
        	count++;

        }
        for(String gene : bank){
        	for(int i = 0; i< end.length();i++){

        		if(end.length() != gene.length()){
        			break;
        		}
	        	if(end.charAt(i) == gene.charAt(i)){
	        		if(i == end.length()-1){
	        		return count;
	        		}
	        		continue;
	        	}
	        	

	       	}
        }



        return -1;
    }
}
*/