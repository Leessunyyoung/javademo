package java013_api;

import java.util.StringTokenizer;

public class Java133_StringTokenizer {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("java,/jsp,spring", ",");
		System.out.println(st.countTokens());//3 ,나/이면 or로 처리해서 갯수세지 않는다
		while(st.hasMoreTokens())
			System.out.println(st.nextToken()); //java
												///jsp
												//spring
		System.out.println("===========================================");
		//구분자 갯수만큼 문자열을 나누어 준다.
		String[] data = new String("java,/jsp,spring").split("[,/]");
		System.out.println(data.length);//4
		for(int i=0;i<data.length;i++) {
			System.out.printf("data[%d]=%s\n",i, data[i]); //data[0]=java
															//data[1]=
															//data[2]=jsp
															//data[3]=spring
			
		}

	}

}
