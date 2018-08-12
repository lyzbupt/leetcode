class Solution{
	public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int status = minutesToTest/minutesToDie + 1;
        int num_of_pig = 0;
        while(Math.pow(status, num_of_pig) < buckets) {num_of_pig++;}
        return num_of_pig;
    }
}

// https://leetcode.com/problems/poor-pigs/discuss/94328/Math-problem-Java-AC-code-with-brief-explanations-11092016