package java018_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Java189_LinkedList {

	public static void main(String[] args) {
		
		System.out.println("======Array==========");
		ArrayList<String > aList = new ArrayList<String>();
		
		//append
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		
		ListIterator<String> ank = aList.listIterator();
		System.out.println("앞 -> 뒤");
		while(ank.hasNext())
			System.out.println(ank.next());
		
		System.out.println("======LinkedList=======");
		LinkedList<String> aNode = new LinkedList<String>();
		//append
		aNode.add(new String ("java"));
		aNode.add(new String ("jsp"));
		aNode.add(new String ("spring"));
		
		//ListIterator 인터페이스는 Iterator 인터페이스를 상속받아 여러 기능을 추가한 인터페이스
		ListIterator<String> ite = aNode.listIterator();
		System.out.println("앞 -> 뒤");
		while(ite.hasNext())
			System.out.println(ite.next());
		
		System.out.println("뒤 -> 앞");
		while(ite.hasPrevious())
			System.out.println(ite.previous());
	}//end main()

}//end class
