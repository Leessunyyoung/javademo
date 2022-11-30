package java010_abstract_interface.part04;

public interface CarRun {
	int carCoun = 5;//public static final int carCount = 5;
	
//	public CarRun() 
//	static {System.out.println("CarRun");}
	void prn();//abstract public
//	 void display() {}
	class Sun{ //pulic static class Sun {}
	 //인터페이스안에 클래스정의 가능하다.	
		public Sun() {
			System.out.println("Sun Constructor");
		}
	}
}
