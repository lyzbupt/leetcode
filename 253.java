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
    public int minMeetingRooms(Interval[] intervals) {
        if(intervals.length == 0) return 0;
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        int i = 0;
        for(Interval interval : intervals){
        	start[i] = interval.start;
        	end[i] = interval.end;
        	i++;
        }
        int room = 0;
        Arrays.sort(start);
        Arrays.sort(end);
        int startPoint = 0;
        int endPoint = 0;
        while(startPoint < intervals.length){
        	if(start[startPoint] >= end[endPoint]){
        		endPoint++;
        	}else{
        		room++;
        	}
        	startPoint++;
        }
        return room;
    }
}