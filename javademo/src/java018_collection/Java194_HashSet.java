package java018_collection;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/*
 * Hashtalve
 * 1. Map인터페이스 구현해놓은 클래스
 * 2. Map인터페이스를 구현해 놓은 클래스들은 key,value쌍으로 저장한다.
 * 3. value을 구현해주는 것은 key 이므로 key은 중복을 허용하지 않는다.
 * 
 */
public class Java194_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> t = new Hashtable<Integer,String>();
		t.put(10, "java");
		t.put(20, "jsp");
		t.put(30, "spring");
		
		System.out.println(t.get(10));
		
		System.out.println("=====Enumeration======");
		
		Enumeration<String> enu = t.elements();
		
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
		
		Enumeration<Integer> enuKey = t.keys();
		//key 가져오기
		while(enuKey.hasMoreElements()) {
			Integer key = enuKey.nextElement();
			System.out.printf("%d:%s\n",key,t.get(key));
			}
		System.out.println("===============================");
		Set<Integer>st =t.keySet();
		for(Integer key : st)
			System.out.printf("%d:%s\n",key,t.get(key));
	}

}
