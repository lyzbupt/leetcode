class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x + y < z) return false;
        if(x == z || y == z || x + y == z) return true;
       	int gcd = 0;
       	while(y!=0){
       		int temp = y;
       		y = x % y;
       		x = temp;
       	}
       	return z%x == 0;
    }
}