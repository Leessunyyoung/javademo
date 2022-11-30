package java012_api;

public class Java116_String {

	public static void main(String[] args) {
		String sn = "java"; //새로운 메모리 생성 안함
		String sg = "java";
		
		String st = new String("java"); //새로운 메모리 생성
		String ss = new String("java");
		
		//주소비교
		System.out.printf("sn==sg:%b\n",sn==sg); //sn==sg:true
		System.out.printf("st==ss:%b\n",st==ss); //st==ss:false\
		
		//메모리에 저장된 문자열 비교
		System.out.printf("sn.equals(sg):%b\n",sn.equals(sg)); //sn.equals(sg):true
		System.out.printf("st.equals(ss):%b\n",st.equals(ss)); //st.equals(ss):true
		//st.equlasIgnoreCase(st) : 대소문자 구분 안함
		//st.equals(st) : 대소문자 구분함
		
		System.out.println(sn.toString());//java
		System.out.println(sn);//java
	}

}
