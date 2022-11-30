package java004_array;
/*
 * data배열에서 대문자의 갯수를 출력하는 프로그램 구현
 * 
 * [출력결과]
 * 대문자 갯수 :2
 * 
 * */
public class Java042_array {

	public static void main(String[] args) {
		char[] data = new char[] {'a','b','F','R','a'};
		int cnt = 0;
		
		for(int i=1; i< data.length;i++) {
			if('A'< data[i]  && data[i] >'Z') {
				cnt++;
			}
		}
		System.out.println("대문자갯수:"+ cnt);
//		System.out.printf("대문자갯수:%d",cnt);
	}

}
