package java001_basic.prob;

/*
 * num변수의 값이 10의 배수이면 1을 아니면 0을 
 * res변수에 리턴하는 프로그램을 구현하시오.
 * [실행결과]
 * res=0
 */
//% 나머지 /몫
public class Prob01 {

	public static void main(String[] args) {
		int num = 10;
		int res;
		
		if(num % 10 == 0){
			res = 1;
			
		}else{
			res = 0;
			return;
		}
		System.out.printf("res = %d",res);
	}
   
}
