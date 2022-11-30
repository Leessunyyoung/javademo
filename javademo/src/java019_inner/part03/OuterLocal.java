package java019_inner.part03;

public class OuterLocal {
	private int x;
	private int y;
	final private int z=10;
	
	public void call(final int a) {
		final int b =20;
		int c =30;
//		a = 300;
//		c = 500;
		System.out.printf("a=%d\n",a);
		
		class InnerLocal{
			void prn() {
				x=50;
				y=150;
//				z =20;
				System.out.println("x=" +x);
				System.out.println("y=" + y);
				System.out.println("a=" + a);//public void call(final int a)여야지 출력
				System.out.println("b=" + b);
				System.out.println("c=" + c);//값이 할당되있어 오류가 뜨지않는데 c=500를 추가할시 오류가 뜬다
			}
		}//end prn()
		InnerLocal inner = new InnerLocal();
		inner.prn();
		
	}//end call()
	
}//end class
