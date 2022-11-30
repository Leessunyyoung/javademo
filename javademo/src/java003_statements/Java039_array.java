package java003_statements;

public class Java039_array {

	public static void main(String[] args) {
		int[] num = new int[] {22,3,8,12};
		int sum = 0;
		
//		sum = sum + num[0]; //22
//		sum = sum + num[1];//25
//		sum = sum + num[2];//33
//		sum = sum + num[3];//45
		
		for(int i = 0;i <num.length; i++) {
			sum = sum+num[i];
		}
		System.out.println(sum);
	}//end main()

}//end class
