class Solution{
	public int[] asteroidCollision(int[] a){
		Stack<Integer> stack = new Stack<>();

		for(int i = 0; i < a.length; i++){

			// 如果是正的，就都放进去
			if(stack.isEmpty() || a[i] > 0){
				stack.push(a[i]);    // 堆顶没有元素，不管是什么都加进去。 
				continue;
			}

			while(true){
				int prev = stack.peek();  // prev 是堆顶的元素
				if(prev < 0){      // 堆顶是负的，直接加进去
					stack.push(a[i]);
					break;
				}

				else if(prev == -a[i]){  // 和堆顶一样大，相撞
					stack.pop();
					break;
				}
				else if(prev > -a[i]){  // 这个没有负的没有堆顶的元素大
					break;  // 忽略掉
				}
				else{
					stack.pop(); // 现在这个负的更大
					if(stack.isEmpty()){
						stack.push(a[i]);
						break;
					}
				}
			}
		}
		int[] res = new int[stack.size()];
		for(int i = stack.size() -1 ; i>=0; i--){
			res[i] = stack.pop();
		}
		return res;
	}
}