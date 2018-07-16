class Solution {


	// ()()() after delete ()(
	// ()(()) after delete  (
	// (())() after delete (()
	// (()()) after delete ((
	// ((()))

	// Algorithm: always change first ')' to '(', after delete two parentheses

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateOne(0,0,n,new StringBuilder(), result);
        return result;
    }
    private void generateOne(int leftBracket, int rightBracket, int n, StringBuilder curRes, List<String> result){
    	if(leftBracket == n && rightBracket == n){
    		result.add(curRes.toString());
    		return;
    	}
    	if(leftBracket > rightBracket && rightBracket < n){
    		curRes.append(")");
    		generateOne(leftBracket, rightBracket+1, n, curRes, result);
    		curRes.deleteCharAt(curRes.length()-1);
    	}
    	if(leftBracket < n){
    		curRes.append("(");
    		generateOne(leftBracket+1, rightBracket, n, curRes, result);
    		curRes.deleteCharAt(curRes.length()-1);
    	}
    }
}