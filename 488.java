
public class Solution {
    
    private int aux(String s, int[] c){
        if("".equals(s)) return 0;
//worst case, every character needs 2 characters; plus one to make it impossible, ;-)
        int res = 2 * s.length() + 1; 
        for(int i = 0; i < s.length();){
            int j = i++;
            while(i < s.length() && s.charAt(i) == s.charAt(j)) i++;
            int inc = 3 - i + j;
            if(c[s.charAt(j)] >= inc){
                int used = inc <= 0 ? 0 : inc;
                c[s.charAt(j)] -= used;
                int temp = aux(s.substring(0, j) + s.substring(i), c);
                if(temp >= 0) res = Math.min(res, used + temp);
                c[s.charAt(j)] += used;
            }
        }
        return res == 2 * s.length() + 1 ? -1 : res;
    }
    
    public int findMinStep(String board, String hand) {
        int[] c = new int[128];
        for(char x : hand.toCharArray()){
            c[x]++;
        }
        return  aux(board, c);
    }
}


//https://leetcode.com/problems/zuma-game/discuss/97027/StraightForward-Recursive-Java-Solution-beat-97