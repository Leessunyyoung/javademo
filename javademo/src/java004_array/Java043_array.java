package java004_array;

public class Java043_array {

	public static void main(String[] args) {
		//2차원배열
		
		//3행2열의 2차원배열
		int[][] num = new int[3][2];
		System.out.printf("%4d",num[0][0]); //0행0열
		System.out.printf("%4d\n",num[0][1]); //0행 1열
		System.out.printf("%4d",num[1][0]); //1행0열
		System.out.printf("%4d\n",num[1][1]);  //1행 1열
		System.out.printf("%4d",num[2][0]); //2행 0열
		System.out.printf("%4d\n",num[2][1]); //2행 1열
		
		num[0][0] =1;
		num[0][1] = 2;
		num[1][0] = 3;
		num[1][1] =4;
		num[2][0] = 5;
		num[2][1] =6;
		
		//2차원배열에서 배열.length은 행의 갯수를 리턴한다.
//		for(int row=0; row<num.length; row++) {
//			System.out.printf("%4d",num[row][0]);
//			System.out.printf("%4d\n",num[row][1]);
			
			System.out.println("======================");
			for(int row = 0; row<num.length; row++) {
			for(int col=0; col<num[row].length; col++) {
				System.out.printf("%4d",num[row][col]);
			}
			System.out.println();
			
		}
	}//end main()

}//end Class
