class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
        	return Integer.MAX_VALUE;
        }
        if(divisor == -1 || divisor ==1){
        	if(divisor == 1){
        		return dividend;
        	}
        	else{
        		return -dividend;
        	}
        }

        boolean isDiff = false;
        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            isDiff = true;
        }

        long d1 = Math.abs((long)dividend); 
        long d2 = Math.abs((long)divisor);
        long absDivisor = d2;
        long inc = 1;
        long result = 0;
        while (d1 >= d2) {
            d1 -= d2;
            result += inc;
            d2 <<= 1;
            inc <<= 1;
            // System.out.println("inc: " + inc + " res:" + res);
            while (d1 < d2 && d2 > absDivisor) {
                d2 >>= 1;
                inc >>= 1;
            }
        }
        return isDiff ? -(int)result : (int)result;
        /*
        int result = 0;
        int temp = 1;
        if(dividend>=0 && divisor>0){
        	while(dividend>=divisor){
        		dividend -=divisor;

        		result+=temp;

        	}
        }
        else if(dividend<=0 && divisor<0){
        	while(dividend<=divisor){
        		dividend -=divisor;
        		result++;
        	}
        }
        else if(dividend>=0 && divisor<0){
        	while(-dividend <= divisor){
        		dividend += divisor;
        		result++;
        	}
        	result = -result;
        }
        else{
        	while(dividend <= -divisor){
        		dividend += divisor;
        		result++;
        	}
        	result = -result;
        }
        return result;
        */
        
    }
}