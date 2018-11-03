class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses <= 0)
        	return false;
        Queue<Integer> queue = new LinkedList<Integer>();
        int[] inDegree = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++) inDegree[prerequisites[i][0]]++;
        for(int i = 0; i < numCourses; i++){
        	if(inDegree[i] == 0){
        		queue.offer(i); // find the start courses
        	}
        }
        // begin traverse
        while(!queue.isEmpty()){
        	int startCourse = queue.poll();
        	for(int i = 0; i < prerequisites.length; i++){
        		if(startCourse == prerequisites[i][1]){
        			if(--inDegree[prerequisites[i][0]] == 0){
        				queue.offer(prerequisites[i][0]);
        			}
        		}
        	}
        }
        for(int i =0; i < numCourses; i++){
        	if(inDegree[i] !=0) return false;
        }
        return true;
    }
}