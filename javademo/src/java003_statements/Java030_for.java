package java003_statements;
/*
 * 3의 배수를 제외한 숫자만 출력
 * 1
 * 2
 * 4
 * 5
 * 7
 * 8
 * 10
 
 * */
public class Java030_for {

	public static void main(String[] args) {
		for(int i=1; i<=10 ; i++) {
			if(i %3 ==0) {
				continue;
			}
				System.out.println(i);
		}
		

	}

}
