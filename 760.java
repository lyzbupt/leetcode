// 760. Find Anagram Mappings

class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        HashMap<Integer, Stack<Integer>> map = new HashMap<Integer, Stack<Integer>>();
        int[] ans = new int[A.length];
        for(int i=0; i<A.length; i++){
        	if(map.containsKey(B[i])){
                Stack stack = map.get(B[i]);
                stack.push(i);
        		map.put(B[i], stack);
        		//map[B[i]] = map[B[i]].push(i);
        	}else{
        		Stack<Integer> stack  = new Stack<Integer>();
        		//map[B[i]] = stack.push(i);
                stack.push(i);
        		map.put(B[i], stack);
        	}
        }
        for(int i=0; i<A.length; i++){
        	ans[i] = map.get(A[i]).pop();
        }
        //int a = new int[]
        return ans;
    }
}