package java004_array.prob;

/*
 * num배열에서 최대값을 출력하는 프로그램을 구현하시오.
 * [출력결과]
 * 최대값:95
 */

public class Prob_01 {
	public static void main(String[] args) {
		int max[];
		int[] num = { 94, 85, 95, 88, 90 };
		for(int i=0;i<4;i++) {
		 if(num[i] < num[i+1]) {
		 num[i] = num[i+1];
		 i++;
		 System.out.println(num[i]);
		 }
		 
		}
		
	}// end main()

}// end class
