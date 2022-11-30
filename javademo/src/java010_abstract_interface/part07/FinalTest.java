package java010_abstract_interface.part07;

public class FinalTest {
	//클래스에서 final은
	final int CODE = 1;//final이 선언 변수는 초기값을 할당해야 한다.
	
	public FinalTest() {
		
	}
	void display() {
		System.out.println("display");
	}
	//final 메소드
	final void process() {
		System.out.println("process");
		
	}

}
