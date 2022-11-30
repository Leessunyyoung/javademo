package java004_array;
/*
 * 
 * 12345
 * 678910
 * 1112131415
 * 1617181920
 * 
 * 1 2 * 4 5
 * *7  8 * 10
 * 11 * 13 14 *
 * 16 17 * 19 20
 * 
 * */
public class Java046_array {

	public static void main(String[] args) {
		int [][] num = {{1, 2, 3, 4, 5},
						{6, 7, 8, 9, 10},
						{11, 12, 13, 14, 15},
						{16, 17, 18, 19, 20}};

		
		for(int col=0;col <num.length;col++) {
			for(int row=0;row <num[col].length;row++) {
				if(num[col][row] % 3 ==0) {
					System.out.printf("%4s",'*');
				}else {
				System.out.printf("%4d ",num[col][row]);
				}
			}
			System.out.println("\n");
		}
	}

}
