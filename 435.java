/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public int eraseOverlapIntervals(Interval[] intervals) {
        if(intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> (a.end == b.end ? 
        	b.start - a.start : a.end - b.end));
		int end = intervals[0].end;
		int res = 1;
		for(int i = 1; i < intervals.length; i++){
			if(intervals[i].start >= end){
				end = intervals[i].end;
				res++;
			}
		}
		return intervals.length - res;
    }
}