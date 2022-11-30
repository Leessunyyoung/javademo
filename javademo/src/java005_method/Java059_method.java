package java005_method;
/*
 * [출력결과]
 * 
 * 10일때 =>10은 짝수입니다.
 * 9일때 =>9는 홀수입니다
 * */

public class Java059_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data =9;
//		boolean result = process(data);
//		if(result == true) {
//			System.out.printf("%d는 짝수입니다",data);
//		}else {
//			System.out.printf("%d는 홀수입니다",data);
//		}
////////////////////////////////////////
//		String result = process(data)? "짝수" : "홀수";
//		System.out.printf("%d는 %s입니다.\n",data,result);
//////////////////////////////////////////
		System.out.printf("%d 는 %s입니다 \n",data,process(data)? "짝수" : "홀수");
		
		int a =1;
		System.out.printf("%d %d %d %d\n" ,++a,++a,++a,a); //2 3 4 4
		System.out.printf("%d %d %d %d\n" ,a++,a++,a++,a); //4 5 6 7
		
		
	}//end main
	
	public static boolean process(int data) {
		//data매개변수의 값이 짝수이면 true,
		//홀수이면 false를 리턴하는 메소드 구현
////		boolean check;
//		if(data % 2 == 0) {
////			check = true;
//			return true;
//		}else {
////			check = false;
//			return false;
//		}		
////		return check;
//		
//////////////////////////////////////////////////
		return data % 2 == 0 ? true : false;
		
		
	}//end process()
}//end process
