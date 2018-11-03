class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        int k = 0;
        if(numCourses <= 0) return res;
        Queue<Integer> queue = new LinkedList<Integer>();
        int[] inDegree = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
        	inDegree[prerequisites[i][0]]++;
        }
        for(int i = 0; i < numCourses; i++){
        	if(inDegree[i]==0){
        		queue.add(i);
        		res[k++] = i;
        	}
        }
        // begin
        while(!queue.isEmpty()){
        	int startCourse = queue.poll();
        	for(int i = 0; i < prerequisites.length;i++){
        		if(startCourse == prerequisites[i][1]){
        			if(--inDegree[prerequisites[i][0]] == 0){
        				queue.offer(prerequisites[i][0]);
        				res[k++] = prerequisites[i][0];
        			}
        		}
        	}
        }
        for(int i = 0; i< numCourses; i++){
        	if(inDegree[i] != 0) return (new int[0]);
        }
        return res;
    }
}