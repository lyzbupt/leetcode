class Solution {
    public List<String> letterCombinations(String digits) {
    	// digits example 5673
    	String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    	LinkedList<String> result = new LinkedList<String>();
    	if(digits.isEmpty()) return result;
    	result.add("");
        while(result.peek().length()!=digits.length()){
        	String remove = result.remove(); //remove a not finished string and add more
        	String letter = letters[digits.charAt(remove.length())-'0'];
        	for(char c : letter.toCharArray()){
        		result.addLast(remove+c);
        	}

        }
        return result;
    }
}