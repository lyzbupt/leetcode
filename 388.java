class Solution {
    public int lengthLongestPath(String input) {
        String[] paths = input.split("\n");
        int[] stack = new int[paths.length + 1]; // paths.length is the maxminum level, +1 means stack[0] is empty
        int res = 0;
        for(String s:paths){
        	int level = s.lastIndexOf("\t") + 1;  // find the level of this String s
        	stack[level+1] = stack[level] + s.length() - level + 1;  // +1 means count "/" for final string
        	int curLen = stack[level + 1];
        	if(s.contains(".")) res = Math.max(res, curLen - 1); // -1 means the first dir no "/"
        }
        // for the case of "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext", there is no level 3, stack[4] = 0
        return res;
    }
}