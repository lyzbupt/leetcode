class Solution{
	public boolean isPowerOfFour(int num){
		return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
	}
}


class Solution {
    public boolean isPowerOfFour(int num) {
        while(num > 0 && num %4 ==0){
        	num = num / 4;
        }
        return num == 1 ? true : false;
    }
}