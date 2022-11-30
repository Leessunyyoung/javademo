package java008_static_access.part02;

public class OrderStatic {
	static {//스태틱다음 생성자가 출력된다.
		System.out.println("static");
	}
	public OrderStatic() {//생성자
		System.out.println("constructor");
	}
	public void display() {//메소드
		System.out.println("display");
	}
}
