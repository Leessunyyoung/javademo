package java018_collection;

import java.util.Comparator;

public class Ascending implements Comparator<Integer>{
	
	
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
//		return o2>o1 ? 1 : o2<o1 ? -1 : 0;//내림차순
//		 o2>o1 ? -1 : o2<o1 ? 1 : 0;->오름차순
		return o1.compareTo(o2);//오름차순
		//return o2.compareTo(o1)->내림차순
 	}
}
