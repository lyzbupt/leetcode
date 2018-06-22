

class ListNode{
	int val;
	ListNode next;
	ListNode (int x){
		val = x;
		next = null;
	}
}

public class Solution{
	public boolean hasCycle(ListNode head){
		Set<ListNode> nodesSet = new HashSet<>();
		while(head != null){
			if(nodesSet.contains(head)){
				return true;
			}
			else{
				nodesSet.add(head);
			}
			head = head.next;
		} 
		return false;
	}
}

/*
HashSet()  空set， capacity 16, 加载因子0.75
HashSet(Collection<? extends E> c)  指定collection中元素的 set
HashSet(int initialCapacity) , 指定 capacity
HashSet(int initalCapacity, float loadFactor) 指定加载因子

四、HashSet的一些常用方法：

添加元素：

hashset.add(E e)：返回boolean型，如果此 set 中尚未包含指定元素，则添加指定元素；如果此 set 已包含该元素，则该调用不更改 set 并返回 false。

删除元素：

hashset.clear()：从此 set 中移除所有元素。

hashset.remove(Object o)：如果指定元素存在于此 set 中，则将其移除。

hashset.isEmpty()：如果此 set 不包含任何元素，则返回 true。

hashset.contains(Object o)：如果此 set 包含指定元素，则返回 true。

hashset.size()：返回此 set 中的元素的数量（set 的容量）。


*/