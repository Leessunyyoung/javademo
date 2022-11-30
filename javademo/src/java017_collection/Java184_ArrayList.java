package java017_collection;

import java.util.ArrayList;

/*	String 은 고정 StringBuffer은 가변
 * 	StringBuffer은 동기화 StrigBuilder 비동기화
 * 
 * 동기화 
 * 클라이언트 요청->응답받을때까지 작업안댐
 * 비동기화
 * 동기화와 상관없이 그냥 요청을 계속 보낸다
 * Vector와 ArrayList
 * 1. Vector은 동기화 처리가 되어 있고 ArrayList은 비동기화 처리한다.
 * 2. Vector와 ArrayList은 메모리에 요소를 처리할 때 배열의 구조를 따른다.
 * 3. Vector와 ArrayList의 클래스는 처리방법이 비슷하다.
 * (add해서 넣고 get해서 가져온다)
 * 4. Vector와 ArrayList으로 수시로 요소의 삽입, 삭제를 처리하는 것은 좋은 방법이 아니다
 */
public class Java184_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10);//auto boxing -> up-casting
		aList.add(20);
		aList.add(30);
		
		for(int i=0;i<aList.size();i++) 
			System.out.println(aList.get(i));
//			10
//			20
//			30
			System.out.println("===============================");
			for(Integer it : aList)
				System.out.println(it);
		System.out.println("=============================");
		System.out.println(aList.remove(0));//10

		System.out.println("===============================");
		for(Integer it : aList)
			System.out.println(it);//20 30
		System.out.println(aList.remove(new Integer(20))); //true
		
		for(Integer it : aList)
			System.out.println(it);//30
	}//end main()

}//end class
