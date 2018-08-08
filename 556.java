class Solution {
	// 53497644
    public int nextGreaterElement(int n) {
        char[] number = (n + "").toCharArray();
        int i, indexSmall;
        for( i = number.length-1; i>0; i--){
        	if(number[i-1] < number[i])
        		break;
        }
        if(i==0)
        	return -1;
        indexSmall = i;
        for(int j=i+1; j<number.length;j++){
        	if(number[j] > number[i-1] && number[j] <= number[indexSmall])
        		indexSmall = j;
        }

        char temp = number[i-1];
        number[i-1] = number[indexSmall];
        number[indexSmall] = temp;

        Arrays.sort(number,i,number.length);
        long val = Long.parseLong(new String(number));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }
}



// https://leetcode.com/problems/next-greater-element-iii/discuss/101824/Simple-Java-solution-(4ms)-with-explanation.