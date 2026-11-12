class TwoArray{
	public static void main(String args []){
		int x [][] = new int [5][2] ;
			x[0][0] =10 ;
			x[0][1] =20 ;
			x[1][0] =30 ;
			x[1][1] =40 ;
			x[2][0] =50 ;
			x[2][1] =60 ;
			x[3][0] =70 ;
			x[3][1] =80 ;
			x[4][0] =90 ;
			x[4][1] =100 ;
			
			for(int i = 0; i<= 4; i++){
				for(int j = 0; j<= 1; j++){
					System.out.println(x[i][j]);
				}
			System.out.println("");
			}
	}
}