class MovingAverage {
	private double previousSum = 0.0;
	private int maxSize;
	private Queue<Integer> window;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        window = new LinkedList<Integer>();
        maxSize = size;
    }
    
    public double next(int val) {
        if(window.size() == maxSize){
        	previousSum -= window.remove();
        }
        previousSum += val;
        window.add(val);
        return previousSum / window.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */