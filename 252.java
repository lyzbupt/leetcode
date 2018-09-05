class Solution{
	public boolean canAttendMeetings(Interval[] intervals){
		Arrays.sort(intervals, (x,y) -> x.end - y.end);
		for(int i = 1; i < intervals.length; i++){
			if(intervals[i].start < intervals[i-1].end)
				return false;
		}
		return true;
	}
}