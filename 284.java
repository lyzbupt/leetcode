// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
	Integer peekValue = null;
	private Iterator<Integer> iterator = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator = iterator;
	}

    // Returns the next element in the iteration without advancing the iterator.
    // 如果调用过就不再调用，需要存下来。需要返回下一个element
	public Integer peek() {
        if(peekValue == null && iterator.hasNext()){
        	peekValue = iterator.next();
        }
        return peekValue;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(peekValue!= null){
	    	int temp = peekValue;
	    	peekValue =null;
	    	return temp;
	    }
	    return iterator.next();
	}

	@Override
	public boolean hasNext() {
	    if(peekValue!=null){
	    	return true;
	    }
	    return iterator.hasNext();
	}
}