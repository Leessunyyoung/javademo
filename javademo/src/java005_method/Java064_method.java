package java005_method;
/*
 * java test
 * tset avaj
 * java test
 * */

public class Java064_method {

	public static void main(String[] args) {
		char [] arr = {'j','a','v','a',' ','t','e','s','t'};
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);

	}//end main()
	
	//shallow copy : 주소복사
	//deep copy : 요소복사
	public static char[] reverse(char[] data) {
		//data의 요소 앞뒤를 바꿔서 리턴하는 프로그램 구현;
		char [] rev = new char[data.length];
//		rev[0] = data[8];
//		rev[1] = data[7];
//		rev[2] = data[6];
//		rev[3] = data[5];
//              ...
//		rev[8] = data[0];
		for(int i = 0;i<data.length;i++) {
			rev[i] = data[data.length-1-i];
		}
		return rev;
	} 
	
}//end reverse()
