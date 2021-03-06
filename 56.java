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
	private class IntervalComparator implements Comparator<Interval>{
		public int compare(Interval a, Interval b){
			return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
		}
	}
	
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new IntervalComparator());

        LinkedList<Interval> res = new LinkedList<Interval>();
        for(Interval interval:intervals){
        	if(res.isEmpty() || res.getLast().end < interval.start){
        		res.add(interval);
        	}else{
        		res.getLast().end = Math.max(res.getLast().end, interval.end);
        	}
        }
        return res;
    }
}