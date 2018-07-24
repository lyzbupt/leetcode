class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> sums = new HashMap<>();
        int count = 0;
        for(int i=0; i<A.length;i++){
        	for(int j=0; j<B.length;j++){
        		int sum = A[i]+B[j];
        		if(sums.containsKey(sum)){
        			sums.put(sum,sums.get(sum)+1);
        		}else{
        			sums.put(sum, 1);
        		}
        	}
        }

        for(int m=0; m<C.length; m++){
        	for(int n=0; n<D.length;n++){
        		int sum = -(C[m]+D[n]);
        		if(sums.containsKey(sum)){
        			count = count + sums.get(sum);
        		}
        	}
        }
        return count;

    }
}