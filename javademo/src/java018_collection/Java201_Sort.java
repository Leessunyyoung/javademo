package java018_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Java201_Sort {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,3,5,2,4,1};
		
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(arr));//->배열을 리스트로 바꿔준다
		//void java.tuil.ArrayList.sort(Comparator <? super Integer> c)
		aList.sort(new Ascending());
		
		System.out.println(aList.toString());//오름차순
		
		aList.sort(new Descending());
		System.out.println(aList.toString()); //내림차순
	}

}
