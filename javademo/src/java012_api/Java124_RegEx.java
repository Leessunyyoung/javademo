package java012_api;
/*
 * 정규화 표현식(Regular Expression)
 * 1. 정규화 표현식(정규식)이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열은
 * 	   찾아내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해서
 * 	   작성한 문자열을 말한다. 
 */
public class Java124_RegEx {

	public static void main(String[] args) {
		String sn = "java korea";
		String sg = "";
		
		//a 또는 r이면 '_'로 변경
		for(int i=0; i<sn.length();i++) {
			char data = sn.charAt(i);
			if(data == 'a' || data == 'r') {
				sg += "_";
			}else {
				sg+=data;
			}
		}
		System.out.println(sg);
		
		System.out.println("Regular Expression을 이용한 문자 변경");
		System.out.println(sn.replaceAll("[ar]","_")); //[]안은or이다[ar]을 _로 변경한다.
		
		//sn변수에 저장된 문자열에서 a이거나 r이 포함되어 있으면 true 아니면 false를 리턴
		//atest, rtest, testa, testr, terst
		System.out.println(sn.matches(".*[ar].*"));//true .->임의의 문자열  .*-> 임의의 문자가 여러개 있다.
		
		//sn변수에 저장된 문자열에서 a이거나 r로 시작하면 true 아니면 false을 리턴
		System.out.println(sn.matches("[ar].*")); //a거나r로 시작되는  false
		
		
		//sn변수 저장된 문자열에서 a이거나 r로 끝나면 true 아니면 false를 리턴
		System.out.println(sn.matches(".*[ar]"));
		
		String st = "java    korea"; //13
		
		//s는 공백이다 2개부터 3개 까지의 공백을 @로 생성해라
		String sa = st.replaceAll("\\s{2,3}","@");
		System.out.println(sa);
		System.out.println(sa.length());
		
				

	}//end main()

}//end class
