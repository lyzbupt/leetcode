/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
	Iterator<Integer> iterator;
    public NestedIterator(List<NestedInteger> nestedList) {
        List<Integer> flattenedList = new ArrayList<>();
        if(nestedList != null){
        	Deque<NestedInteger> stack = new LinkedList<>();
        	for(int i = nestedList.size() - 1; i >= 0; i--){
            	stack.push(nestedList.get(i));
      		}
        	while(!stack.isEmpty()){
        		NestedInteger ni = stack.pop();
        		if(ni.isInteger()){   // if is Integer, then get Integer
        			flattenedList.add(ni.getInteger());
        		}else{ // is NestedInteger
        			List<NestedInteger> nl = ni.getList();
        			Collections.reverse(nl);
        			for(NestedInteger ni2 : nl){
        				stack.push(ni2);
        			}
        		}
        	}
    		iterator = flattenedList.iterator();
        }
    }

    @Override
    public Integer next() {
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
}


public class NestedIterator implements Iterator<Integer> {
    Deque<NestedInteger> stack = new LinkedList<>();
    public NestedIterator(List<NestedInteger> nestedList) {
        for(int i = nestedList.size() - 1; i >= 0; i--) {
            stack.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next(){
    	if(!hasNext()) return null;
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext(){
        while(!stack.isEmpty()){
            NestedInteger curr = stack.peek();
            if(curr.isInteger()){
                return true;
            }
            stack.pop();
            for(int i = curr.getList().size() - 1; i >= 0; i--) {
                stack.push(curr.getList().get(i));
            }
        }
        return false;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */