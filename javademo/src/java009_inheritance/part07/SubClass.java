package java009_inheritance.part07;

public class SubClass extends SuperClass {
	public SubClass() {
		
	}
	
	public SubClass(int a,int b,int c) { //2
		/*
		 * *** x,y,z에 값채우기 ***
		 * 10을 넘겨받은 생성자
		 * 10  20  을 넘겨받은 생성자
		 * 10  20  30  을 넘겨받은 생성자
		 * 10  20  30
		 * 합 : 60
		 * 
		 * */
		//여기에 구현하세요.///////
		
		super(a,b,c);//3
		display();
		sumData();
	}
	public void sumData() {
		System.out.println("합: " + (x+ y+ z));
	}

}
