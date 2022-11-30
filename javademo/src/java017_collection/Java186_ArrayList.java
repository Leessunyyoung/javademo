package java017_collection;

import java.util.ArrayList;

public class Java186_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("oracle"));
		aList.add(new String("mysql"));
		aList.add(new String("mssql"));
		String[] arr= display(aList);
		for(String data : aList)
			System.out.println(data);

	}//end main()
	public static String[] display(ArrayList<String> aList) {
//		list를 배열로 받는다
//		String [] stn = new String[aList.size()];
//		for(int i =0; i<stn.length;i++) {
//			stn[i] = aList.get(i);
//		}
//		return stn;
		////////////////////////////////////////////////////
//		String [] stn = new String[aList.size()];
//		aList.toArray​(T[] a)
//		return aList.toArray(stn);
		
		////////////////////////////////////////////////////
		return aList.toArray(new String[aList.size()]);

	}

}
