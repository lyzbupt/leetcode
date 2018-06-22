class Solution {
    public String convertToTitle(int n) {
        StringBuilder ans= new StringBuilder();
		while(n>0){
			n--;
			ans.append((char)('A'+n%26));
			n = n/26;
		}
		ans.reverse();

		return ans.toString();
    }
}