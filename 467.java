class Solution{
	public int findSubstringInWraproundString(String p){

		char[] pp = p.toCharArray();

		if(pp.length==1||pp.length==0)
			return pp.length;

		int[] flag = new int[26];// flag[i] is the maximum unique substring end with i th letter
							// for example end with b, may be 45
							// 12 , 45 ,35, 6,32,3,....
		flag[pp[0]-'a']=1;
		int cnt =1;
		for(int i =1;i<pp.length;i++){
			if(pp[i]-'a'+1==(pp[i-1]-'a'+1)%26+1)cnt++;
			else cnt=1;
            if(flag[pp[i]-'a']<cnt)
                flag[pp[i]-'a']= cnt;
            
			//flag[pp[i]-'a']=max(flag[pp[i]-'a'],cnt);
		}
		int res=0;
		for (int num : flag){
			res+=num;
		}
		return res;
	}
}