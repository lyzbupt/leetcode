// `num1[i] * num2[j]` will be placed at indices `[i + j`, `i + j + 1]` 

class Solution{
	public String multiply(String num1, String num2){
		int l1 = num1.length();
		int l2 = num2.length();
		int[] num = new int[l1+l2];
		StringBuilder result = new StringBuilder();

		for(int i = l1-1;i>=0;i--){
			for(int j = l2-1; j>=0; j--){
				int temp = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
				int p1 = i+j;
				int p2 = i+j+1;
				temp += num[p2];
				num[p2] = temp%10;
				num[p1] += temp/10;
			}
		}

		for(int n : num){
			if(n==0 && result.length()==0)
				continue;
			result.append(n);
		}
		return result.length() == 0 ? "0" : result.toString();
	}




}