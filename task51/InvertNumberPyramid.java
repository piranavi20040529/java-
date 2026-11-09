class InvertNumberPyramid{
	public static void main(String arg[]){
		int n = 5;
		
		for(int i = n; i>= 1; i--){
			for(int j=n; j>i; j--){
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++){
			System.out.print(k+"");
			}
			System.out.println();
		}
	}

}