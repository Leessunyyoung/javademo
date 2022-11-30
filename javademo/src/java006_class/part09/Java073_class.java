package java006_class.part09;
/*
 * Song클래스의 show()메소드를 아래와 같이 출력이 되도록 show() 메소드 구현
 * [실행결과]
 * 노래제목 : Our Love is great
 * 가수 : Baek Yerin
 * 앨범 : Our Love is great
 * 작곡가 :Cloud,Baek Yerin
 * 년도 : 2019
 * 트랙 : 6
 * 
 * */
public class Java073_class {

	public static void main(String[] args) {
		Song sg = new Song("Our Love is great","Baek Yerin","Our Love is great",
				new String[] {"Cloud","Baek Yerin"},
				2019,6);
		sg.show();

	}

}
