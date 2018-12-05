/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {
        int a, b, res;
        do{
        	a =rand7();
        	b = rand7();
        	res = a + (b-1) * 7;
        }while(res > 40);
        return 1 + (res-1) % 10;
    }
}