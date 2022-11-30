package java004_array;
/*
 * a  b  c  d
 * a  b  c  d
 * a  b  c  d
 * a  b  c  d
 * 
 * [출력결과]
 * *  a  b  c  d
 * a  *  b  c  d
 * a  b  *  c  d
 * a  b  c  d  *
 * */
public class Java049_array {

	public static void main(String[] args) {
		char[][]alpa = new char[][] {{'a','b','c','d'},
									{'a','b','c','d'},
									{'a','b','c','d'},
									{'a','b','c','d'}};
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
					System.out.printf("%4c",'*');
				}
				System.out.printf("%4c ",alpa[i][j]);
			
			
			}
			System.out.println();
			if(i==alpa.length-1) {
				for(int j =0;j<alpa[i].length;j++) {
					System.out.printf("%4c",alpa[i][j]);
				}
				System.out.printf("%4c",'*');
			}
		
		}

	}//end main()

}//end class
