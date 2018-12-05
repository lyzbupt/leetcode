class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] num = new int[26];
        for(char c : tasks){
        	num[c - 'A']++;
        }
        Arrays.sort(num);
        int max_val = num[25] - 1;
        int idle = max_val * n;
        for(int i = 24; i >= 0 ; i--){
        	idle = idle - Math.min(max_val, num[i]);
        }
        return idle > 0 ? tasks.length + idle : tasks.length;
    }
}