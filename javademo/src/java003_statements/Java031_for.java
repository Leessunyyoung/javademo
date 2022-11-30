package java003_statements;
/*
 * 1	2	3	4
 * 5	6	7	8
 * 9	10	11	12
 * 
 * */
public class Java031_for {

	public static void main(String[] args) {
		int sum = 1;
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=4;col++) {
				System.out.printf("%4d",sum++);
				
			}//end for col
//			System.out.printf("\n");
			System.out.println();
		}//end for row
	}//end main

}//end class
