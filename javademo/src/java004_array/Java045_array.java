package java004_array;

public class Java045_array {
	
	/*데이터
	 * 홍길동  90 85 40
	 * 이영희 100 35 75
	 * 
	 * 홍길동 90 85 40 215 71.7
	 * 이영희 100 35 75 210 70.0
	 * */

	public static void main(String[] args) {
		String[] name = {"홍길동","이명희"};
		int[][] jumsu = {{90,85,40},
							{100,35,75}};
		
//		for(int row=0; row < 2;row++) {
//			for(int col=0; col<3; col++) {
//			System.out.printf("%3d\n",jumsu[row][col]);
//		}
//			System.out.println();
//		}
//			
		int sum;
		for(int index=0; index <name.length ;index++) {
		
			System.out.printf("%8s  ",name[index]);
			sum=0;
			for(int col=0;col<3;col++) {
				System.out.printf("%4d",jumsu[index][col]);
				sum +=jumsu[index][col];
			}
			System.out.printf("%4d %6.1f\n",sum,(double)sum/3);   //   sum/3.0)
			
		}
		   
		
		

	}//end main()

}
