

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;
        boolean[] used = new boolean[nums.length];
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        dfs(nums, used, list, res);
        return res;
    }

    public void dfs(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> res){
        if(list.size()==nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0 &&nums[i-1]==nums[i] && !used[i-1]) continue;
            used[i]=true;
            list.add(nums[i]);
           // System.out.println(list);
            dfs(nums,used,list,res);
           // System.out.println(list);
            used[i]=false;
            list.remove(list.size()-1);
             //System.out.println(list);
        }
    }
}

/*
class Solution{
	public List<List<Integer>> permuteUnique(int[] nums){
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backTrack(list, new ArrayList<>(), nums ,new boolean[nums.length]);
		return list;
	}

	public void backTrack (List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used){
		if(tempList.size() == nums.length){
			list.add(new ArrayList<>(tempList));
		}else{
			for(int i = 0; i < nums.length; i++){
				if(used[i] || i > 0 && nums[i] == nums[i-1] && used[i-1])
					continue;
				used[i] = true;
				tempList.add(nums[i]);
				backTrack(list, tempList, nums, used);
				used[i] = false;
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}
*/
