package java018_collection;

import java.util.Vector;

public class Java200_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("java");
		v.add("jsp");
		v.add("spring");
		
		System.out.println(v.toString());
		
		Vector<String> t = new Vector<String>();
		t.add("java");
		t.add("mysql");
		System.out.println(t.toString());//string배열이 아니다 그냥 string이다
		System.out.println(t.toString().length()); //13
		
		v.removeAll(t); //v.toString-t.toString() ->v와 t의 차집합
		System.out.println(v.toString());//[jsp, spring]
	}

}
