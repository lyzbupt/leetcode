class Solution{
	public boolean judgeCircle(String moves){
		int vertical = 0, horizon = 0;
		char [] C = moves.toCharArray();
        char Q;
		for(int i=0;i<moves.length();i++){
            Q=C[i];
			switch(Q){
				case 'U':
					vertical++;
					break;
				case 'D':
					vertical--;
					break;
				case 'R':
					horizon++;
					break;
				case 'L':
					horizon--;
					break;
				default:
					System.out.println("Wrong char");
					System.exit(-1);
			}

		}

		return (vertical==0)&&(horizon==0);

	}
}