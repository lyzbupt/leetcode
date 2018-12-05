/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */
public class Solution extends Relation {
     public int findCelebrity(int n) {
         if(n < 1) return 0;
         int candidate  = 0;
         for(int i = 1; i < n ; i++){
             if(knows(candidate,i)) candidate = i;
         }
         for(int i = 0; i < n; i++){
             if(i != candidate && (knows(candidate, i) || !knows(i, candidate)))
                 return -1;
         }
        return candidate;
     }
}

/* brute force
public class Solution extends Relation {
    public int findCelebrity(int n) {
        int[] know = new int[n];
        int[] known = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                if(knows(i,j)) {
                    known[j]++;
                    know[i]++;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(known[i] == n-1 && know[i] == 0) return i;
        }
        return -1;
    }
}
*/