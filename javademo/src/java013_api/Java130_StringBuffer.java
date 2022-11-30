package java013_api;

public class Java130_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		
		//4인덱스에 ",jsp"문자열을 삽입
		sb.insert(4, ",jsp");
		System.out.println(sb);//java,jsp test
		
		//4인덱스부터 8인덱스미만 사이의 문자열을 삭제
		sb.delete(4, 8);
		System.out.println(sb); //java test
		
		//마지막에 문자열을 추가
		sb.append("start");
		System.out.println(sb); //java teststart
		
		//문자열을 반대로 변경
		sb.reverse();
		System.out.println(sb); //tratstset avaj
		
		//String ->StringBuffer->String
		String data = "mybatis orm";
		StringBuffer sg = new StringBuffer(data);
		sg.reverse();
		System.out.println(data); //mybatis orm
        String re = sg.toString();
        System.out.println(re); //mro sitabym
        
        //char[] -> String ->StringBuffer
        char [] arr = {'k','o','r','e','a'};
        String sp=String.valueOf(arr);
        StringBuffer se = new StringBuffer(sp);
//        StringBuffer sr = new StringBuffer();
//        sr.append(sp);->좋은방법 아님
          se.reverse();
          System.out.println(se); //aerok
          System.out.println(new StringBuffer(String.valueOf(arr)).reverse());//new StringBuffer(String.valueOf(arr))->korea
          //new StringBuffer(String.valueOf(arr)).reverse();->aerok
          //valueof:string에서 char요소 가져오기
          
          //StringBuffer -> String -> char[]
          String st = se.toString(); //toString - string->StringBuffer
          char [] val =st.toCharArray();//char->string
          System.out.println(val);//aerok
          
          System.out.println(se.toString().toCharArray()); //aerok
          
          

	}

}
