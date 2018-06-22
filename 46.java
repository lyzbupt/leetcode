// leetcode 46 Permutations
class Solution{
	public List<List<Integer>> permute(int[] nums){
		LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
		result.add(new ArrayList<Integer>());
		for(int n : nums){
			int size = result.size();
			for (int i=0; i<size; i++){
				List<Integer> r = result.pollFirst();
				for(int j = 0; j<= r.size();j++){
					List<Integer> t = new ArrayList<Integer>(r);
					t.add(j,n);
					result.add(t);
				}
			}
		}
		return result;
	}
}
/*
就是遍历nums（第一个for loop），当开始进行nums[i]时，res中的结果是nums[0]至nums[i-1]的全排列。
每一次循环中，需要将nums[i]加入到res中的每一个结果中的每一个位置，然后开始下一次循环。
具体做法是，每一次循环开始，先记录当前res的大小（size），取出res中的第一个，
在每个位置添加nums[i]然后加到res末尾（第三个for loop，循环r.size()次），一共进行size次（第二个for loop）。

*/