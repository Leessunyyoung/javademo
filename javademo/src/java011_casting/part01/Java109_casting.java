package java011_casting.part01;
/*
 * 형변환(casting)
 * 1.묵시적 형변환: 작 -> 큰
 * 2.명시적 형변환 : 큰 -> 작
 * 		int num =3;
 * 		double data = num; //묵시적 형변환
 * 		short val = (short)num; //명시적 형변환
 * 
 * 객체형변환 - 참조데이터 타입
 * 1. 상속관게일때 형변환이 가능하다(is a)
 * 2. 업캐스팅 발생된 후 다운캐스팅을 할 수 있다.
 * 		-업캐스팅(up-casting) : 부모객체로 자식객체를 참조하도록 형변환하는 기술
 * 		-다운캐스팅(down-casting) : 업캐스팅을 다시 원상복귀해주는 형변환하는 기술
 * */
public class Java109_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SampleA sa = new SampleA();
//		SampleB sb = ndw SampleB()l
//		sa= (SampleA)sb;
		
		Parent p =new Parent();
		Child c = new Child();
		
		p = c; //업캐스팅(up-casting)
		p.process();
		
		//다운캐스팅(down-casting)
		Child d = (Child)p;
		
		//객체생성 및 업캐스팅
		Parent pt = new Child();
		pt.process();
		
		//다운캐스팅
		Child cn= (Child)pt;
		cn.call();
		cn.process();
	}

}
