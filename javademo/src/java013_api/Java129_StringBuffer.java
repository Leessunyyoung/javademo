package java013_api;
/*
 * 
 * java.lang.String: immutable(불변)
 * java.lang.StringBuffer : mutable(가변), 동기화
 * java.lang.StringBuilder : mutable(가변), 비동기화
 * 
 * StringBuffer 특징
 * 1. 문자열 값을 수정할 수 있는 mutable(가변)이다.
 * 2. 기본 16문자 크기로 지정된 버퍼를 이용하며, 크기를 증가시킬 수 있다.
 */
public class Java129_StringBuffer {

	public static void main(String[] args) {
		String sg = new String("java test java");
		String ss = sg.replace("java","jsp");
		System.out.println("ss: "+ss);//ss: jsp test jsp
		System.out.println("sg:" +sg);//sg:java test java
		System.out.println(ss==sg);//false
		
		StringBuffer sb = new StringBuffer("spring test");
		StringBuffer su = sb.replace(0, 6, "framework"); //(0,0->시작인덱스,끝인덱스,framework) 0부터6자리인덱스를 framework로
		System.out.println("sb:" + sb);//sb:framework test
		System.out.println("su:" + su);//su:framework test
		System.out.println(sb==su);//true
		System.out.println(sb.equals(su));//true
		System.out.println(sb.toString());//메모리에 저장되있는->framework test가 나온다

	}//end main()

}//end class
